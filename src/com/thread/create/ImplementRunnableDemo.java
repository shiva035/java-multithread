package com.thread.create;

public class ImplementRunnableDemo implements Runnable{

	public static void main(String[] args) {
		ImplementRunnableDemo iRD = new ImplementRunnableDemo();
		Thread th = new Thread(iRD);
		th.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable Thread Implement...");
	}

}
