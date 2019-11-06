package com.thread.syncronization;
class StaticTable{
	public synchronized static void print(int value){
		System.out.println("share Table resource with Thread "+ Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			System.out.println("Table : "+ value*i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class SynchronizationStaticDemo {

	public static void main(String[] args) {
		StaticTable t = new StaticTable();
		new Thread("one"){
			public void run(){
				t.print(2);
			}
		}.start();
		
		new Thread("two"){
			public void run(){
				t.print(5);
			}
		}.start();
		
		// TODO Auto-generated method stub
		new Thread("three"){
			public void run(){
				t.print(10);
			}
		}.start();
		
		new Thread("four"){
			public void run(){
				t.print(20);
			}
		}.start();
	}

}
