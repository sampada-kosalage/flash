package Joins;

public class SomeThread extends Thread{

public SomeThread(String name) {
		super();
		this.name = name;
	}

private String name;

		@Override
		public void run() {
			System.out.println("Starting thread:"+name);
			try {
				Thread.sleep(3000);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
			System.out.println("Thread ended:"+name);
		}
	
	}


