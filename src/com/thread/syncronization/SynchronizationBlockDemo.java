package com.thread.syncronization;

class BlockTable{  
	 void printTable(int n){  
	   synchronized(this){//synchronized block  
	     for(int i=1;i<=5;i++){  
	      System.out.println(n*i);  
	      try{  
	       Thread.sleep(400);  
	      }catch(Exception e){System.out.println(e);}  
	     }  
	   }  
	 }//end of the method  
	}  

public class SynchronizationBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockTable t = new BlockTable();
		new Thread(){
			public void run(){
				System.out.println(Thread.currentThread().getName());
				t.printTable(2);
			}
		}.start();
		
		new Thread(){
			public void run(){
				System.out.println(Thread.currentThread().getName());
				t.printTable(5);
			}
		}.start();
		
	}

}
