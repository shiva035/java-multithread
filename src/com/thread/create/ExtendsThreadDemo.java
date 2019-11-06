package com.thread.create;

public class ExtendsThreadDemo extends Thread {
	public void run(){
		System.out.println("Thread is running...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendsThreadDemo st = new ExtendsThreadDemo();
		st.start();
	}

}
