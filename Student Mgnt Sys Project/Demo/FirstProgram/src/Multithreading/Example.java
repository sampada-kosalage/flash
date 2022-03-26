package Multithreading;

import java.util.Random;

public class Example implements Runnable{
	private int threadNo;

	public Example(int threadNo) {
		super();
		this.threadNo = threadNo;
	}

public void run() {
	Random random1=new Randome();
	for(int i=0;i<=9;i++) {
		try {
			Thread.sleep(random1.nextInt(500));
			
		}catch()
			
		
	}
}	
	
}
