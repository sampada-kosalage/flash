package Sort;

import java.awt.List;
import java.util.Collection;
import java.util.LinkedList;


import ExceptionHandling.Training;

public class Main1 {

	public static void main(String[] args) {

		List names=new LinkedList<>();
		names.add(new Names("A"));
		names.add(new Names("B"));
		names.add(new Names("C"));
		names.add(new Names("D"));
		names.add(new Names("E"));
		
		Training obj=new Training();
		obj.printList(name);
		Collection.sort(names);
		System.out.println("__________");
		

	}
	void PrintList(List<Names>List) {
		ListIterator<Names>iterator=List.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Element:"+iterator.next());
		}
	}

}
