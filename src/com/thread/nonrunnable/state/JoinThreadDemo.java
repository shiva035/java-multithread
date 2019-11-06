package com.thread.nonrunnable.state;

public class JoinThreadDemo extends Thread{

	
	public void run() {
		System.out.println("Active Thread "+ Thread.activeCount());
		System.out.println("Current Thread" + Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception " + e);
			}
			System.out.println(Thread.currentThread().getName() + " : value is "+i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinThreadDemo j1 = new JoinThreadDemo();
		JoinThreadDemo j2 = new JoinThreadDemo();
		JoinThreadDemo j3 = new JoinThreadDemo();
		j1.setName("Thread 1");
		j2.setName("Thread 2");
		j3.setName("Thread 3");
		j1.start();
		try {
			j1.join();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception " + e);
		}
		j2.start();
		j3.start();
		System.out.println("/////////////////////////////////");
		System.out.println("Restart with join till time" );
		System.out.println("/////////////////////////////////");
		JoinThreadDemo j4 = new JoinThreadDemo();
		JoinThreadDemo j5 = new JoinThreadDemo();
		j4.setName("Thread 4");
		j4.setPriority(MAX_PRIORITY);
		j5.setName("Thread 5");
		j4.start();
		
		try {
			j4.join(1500);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception " + e);
		}
		
		j5.start();
	}

}
