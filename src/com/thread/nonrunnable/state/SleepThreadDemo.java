package com.thread.nonrunnable.state;

public class SleepThreadDemo extends Thread{
	public void run(){
		for(int i=0; i<5;i++){
			try{
				Thread.sleep(500);
			}catch(InterruptedException interup){
				System.out.println(interup);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepThreadDemo sl1 = new SleepThreadDemo();
		SleepThreadDemo sl2 = new SleepThreadDemo();
		sl1.start();
		sl2.start();
	}

}
