package com.thread.nonrunnable.state;

class TaskPerforme extends Thread{
	public void run(){
		System.out.println("here we perform task before jvm or thread die");
	}
}

public class ShutdownHookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskPerforme t1 = new TaskPerforme();
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(t1);
	}

}
