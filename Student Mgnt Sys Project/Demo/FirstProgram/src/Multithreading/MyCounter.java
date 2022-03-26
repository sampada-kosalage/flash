package Multithreading;

public class MyCounter extends Thread{
	private int threadNo;
	
	public MyCounter(int threadNo) {
		super();
		this.threadNo = threadNo;
	}
public void run() {
	countMe();
}	
public void countMe() {
	for(int i=1;i<=9;i++) {
		try {
			sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The value if i is:"+i+"and the thread number");
	}
}
}
