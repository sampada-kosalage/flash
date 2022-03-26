package LinkedList;

import java.util.LinkedList;

import ExceptionHandling.Training;

public class Sample {

	public static void main(String[] args) {

		LinkedList<String> countries=new LinkedList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("UK");
		countries.add("Japan");
		countries.add("Russia");
		countries.add("England");
        new Training().printList(countries);
		countries.add("Canada");
		countries.add("Brazil");
	    new Training().printList(countries);
	    countries.add("UKK");
		new Training().printList(countries);
	    countries.remove(4);
	    new Training().printList(countries);

	}
	
	void printList(LinkedList<String>List) {
		for(String element:List) {
			System.out.println("Element:"+element);
		}
		System.out.println("_____________");
	}

}
