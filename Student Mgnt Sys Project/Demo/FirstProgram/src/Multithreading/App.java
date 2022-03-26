package Multithreading;

public class App {

	static public int balance=5000;
	
	public void withdraw(int amount) {
		synchronized(this) {
			if(balance<=0) {
			try {
				System.out.println("waiting for balance");
			wait();
			}catch(Exception e) {
				//e.printStackTrace();
				System.out.println("original balance"+balance);
				System.out.println("withdrawal balance"+amount);
                balance=balance-amount;
				System.out.println("withdrrawal successfull and current balance is");

			}
			}
			}
		balance=balance-amount;
		System.out.println("withdrrawal successfull and current balance is:"+1000);
		}
public void deposit(int amount)	{
	System.out.println("we are depositing amount");
	balance=balance+amount;
	synchronized(this) {
		notify();
	}
}
}

