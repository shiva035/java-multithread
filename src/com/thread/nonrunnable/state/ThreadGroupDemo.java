package com.thread.nonrunnable.state;

public class ThreadGroupDemo implements Runnable {

	public static void main(String[] args) {
		Runnable tg = new ThreadGroupDemo();
		ThreadGroup thgroup = new ThreadGroup("Parent");
		Thread t1 = new Thread(thgroup, tg, "one");
		Thread t2 = new Thread(thgroup, tg, "two");
		Thread t3 = new Thread(thgroup, tg, "three");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Thread group name : "+ thgroup.getName() );
		thgroup.list();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread Group Demo");
	
	}

}
