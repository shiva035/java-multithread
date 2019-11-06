package com.thread.nonrunnable.state;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{
	String message;
	
	WorkerThread(String msg){
		System.out.println("class instance created...");
		this.message = msg;
		System.out.println("message..."+ msg);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running thread is " + Thread.currentThread().getName());
		processing();
		System.out.println("thread has been stoped "+ Thread.currentThread().getName());
	}
	
	void processing(){
		try {
			System.out.println("Thread is on sleep state");
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception occure");
		}
	}
	
}

public class ThreadPoolDemo {

	public static void main(String[] args) {
		
		ExecutorService execute = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			Runnable thread = new WorkerThread(""+i);
			execute.execute(thread);
		}
		execute.shutdown();
		while(!execute.isTerminated()){
			
		}
		System.out.println("All Thread Finished");
	}

}
