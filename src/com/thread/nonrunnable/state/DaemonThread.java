package com.thread.nonrunnable.state;

public class DaemonThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThread dt1 = new DaemonThread();
		DaemonThread dt2 = new DaemonThread();
		DaemonThread dt3 = new DaemonThread();
		dt1.setDaemon(true);
		dt1.start();
		dt2.start();
		dt3.start();
	}

}
