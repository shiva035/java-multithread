package com.thread.syncronization;

class Table{
	public synchronized void print(int value){
		System.out.println("share Table resource");
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

class Graph{
	public synchronized void print(int value){
		System.out.println("share Graph resource");
		for (int i = 0; i < 5; i++) {
			System.out.println("Graph : " + value*i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class ThreadOne extends Thread{
	Table t;
	public ThreadOne(Table t) {
		// TODO Auto-generated constructor stub
	this.t = t;
	}
	
	public void run(){
		this.t.print(5);
	}
}

class ThreadTwo extends Thread{
	Table t;
	public ThreadTwo(Table t) {
		// TODO Auto-generated constructor stub
	this.t = t;
	}
	
	public void run(){
		this.t.print(2);
	}
}

public class SynchonizationMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t = new Table();
		ThreadOne th1 = new ThreadOne(t);
		ThreadTwo th2 = new ThreadTwo(t);
		th1.start();
		th2.start();
		
	//Share resource among two thread handle by method synchronized	
		Graph g = new Graph();
		new Thread(){
			public void run(){
				g.print(10);
			}
		}.start();
		
		new Thread(){
			public void run(){
				g.print(20);
			}
		}.start();
	}

}
