package Multithreading;

public class Main {

	public static int counter =0
	public static void main(String[] args) throws InterruptedException{
 
		/*MyCounter counter1=new MyCounter(1);
		MyCounter counter2=new MyCounter(2);

		long startTime=System.currentTimeMillis();
		counter1.start();
		System.out.println("____________");
		counter2.start();
		Thread.sleep(4505);
		long endTime=System.currentTimeMillis();
		System.out.println("Total time required to process:"+(endTime+startTime));
}*/
		Breakets brackets=new Bracket();
		new Thread(new Runnable()) {
			public void run() {
				for(int i=1;i<=5;i++) {
					bracket.generate();
				};
			}
			
		}).start();
		new Thread(new Runnable()) {
			public void run() {
				for(int i=1;i<=5;i++) {
					bracket.generate();
				};
			}
		}).start();
	}
}
