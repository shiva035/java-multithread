package com.thread.interthread;

class Bank{
	private int amount = 0;
	
	public synchronized void withdrow(int amt){
		
			System.out.println("Withdrowing a amount " + amt);
			if(amount > amt){
				amount -= amt; 
				System.out.println("/******** Status : Withdrow success ********/");
				System.out.println("/***** balance "+ amount + " *****/");
			}else{
				System.out.println("waiting for deposite");
				try {wait();}catch(Exception e){}
				amount -= amt; 
				System.out.println("/******** Status : Withdrow success ********/");
				System.out.println("/***** balance "+ amount + " *****/");
			}
	}
	
	public synchronized void deposite(int amt){
		amount += amt;
		System.out.println("Deposite success with amount "+ amt);
		notify();
	}
}

public class InterThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		Thread t1 = new Thread("one"){
			public void run(){
				b.withdrow(5000);
			}
		};
		
		Thread t2 = new Thread("two"){
			public void run(){
				b.deposite(10000);
			}
		};
		
		t1.start();
		t2.start();
	}

}
