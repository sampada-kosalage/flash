package Lambada;

import java.util.Collection;
import java.util.List;

public class Training {

	public static void main(String[] args) {

		/*new Thread(()->{
			System.out.println("I am inside thread1");
			System.out.println("This is line 2 thread");
       }).start();;*/
		/*List<Data>list=new ArrayList<>();
		list.add(new Data("Sam"));
		list.add(new Data("Ram"));
		
		Collection.sort(list,(Data o1,Data o2)->{
			return o1.getName().compareTo(o2.getName());
		}
				{
			@Override
			public int compare(Data o1,Data o2) {
				return o1.getName().compareTo(o2.getName());
			}
				});
for(Data dta:list) {
	System.out.println(data.getName());
}*/
		Lambada lambada=(int x)->{
		System.out.println("The value of x is:"+x);
		System.out.println("Statement from the demo method");
		};
	lambada.demo(200);
}
}
