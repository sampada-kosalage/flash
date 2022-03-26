package Sort;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

import ExceptionHandling.Training;

public class Main {

	public static void main(String[] args) {

			List<String>countries=new ArrayList<>();
			List<String>demo=new LinkedList<>();

			
			countries.add("USA");
			countries.add("England");
			countries.add("Egypt");
			countries.add("Russia");
			countries.add("Thailand");
			new Training().printList(countries);
			System.out.println("----------");
			countries.sort(null);
			new Training().printList(countries);
			System.out.println("----------");
			Collections.reverse(countries);
			new Training().printList(countries);

			
			demo.add("one");
			demo.add("two");
			demo.add("three");
			demo.add("four");
			demo.add("five");
         //new Training().printList(demo);
			
			
			Integer x=3;
			Integer y=2;
			System.out.println(x.compareTo(y));
}
	void PrintList(List<String>List){
		ListIterator<String> iterator=List.ListIterator();
		while(iterator.hasNext()) {
			System.out.println("Element:"+iterator.next());
		}
	}
	
}
