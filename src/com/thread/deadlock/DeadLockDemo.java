package com.thread.deadlock;


public class DeadLockDemo {
	private static final String resource1 = "one";
	private static final String resource2 = "two";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread("one"){
			public void run(){
				synchronized (resource1) {
					System.out.println("Thread one : "+ resource1 );
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						// TODO: handle exception
					}	
					synchronized (resource2) {
						System.out.println("Thread one : "+ resource2 );
						try {
							Thread.sleep(500);
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
				}
				

			}
		}.start();
		
		new Thread("two"){
			public void run(){
				synchronized (resource2) {
					System.out.println("Thread two : "+ resource1 );
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						// TODO: handle exception
					}			
					synchronized (resource1) {
						System.out.println("Thread two : "+ resource2 );
						try {
							Thread.sleep(500);
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
				}
			}
		}.start();
		
	}

}
