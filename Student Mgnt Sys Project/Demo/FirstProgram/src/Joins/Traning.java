package Joins;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class Traning {

	public static void main(String[] args) {

		ExecutorService excecutorService=Executor.newFixedThreadPool(2);
		SomeThread thread1=new SomeThread("Thread 1");
		SomeThread thread2=new SomeThread("Thread 2");
		SomeThread thread3=new SomeThread("Thread 3");
		SomeThread thread4=new SomeThread("Thread 4");
		SomeThread thread5=new SomeThread("Thread 5");
		SomeThread thread6=new SomeThread("Thread 6");
		SomeThread thread7=new SomeThread("Thread 7");
		SomeThread thread8=new SomeThread("Thread 8");
		SomeThread thread9=new SomeThread("Thread 9");
		SomeThread thread10=new SomeThread("Thread 10");

		excecutorService.execute(thread1);
		excecutorService.execute(thread2);
		excecutorService.execute(thread3);
		excecutorService.execute(thread4);
		excecutorService.execute(thread5);
		excecutorService.execute(thread6);
		excecutorService.execute(thread7);
		excecutorService.execute(thread8);
		excecutorService.execute(thread9);
		excecutorService.execute(thread10);

		excecutorService.shutdown();
	}

}
