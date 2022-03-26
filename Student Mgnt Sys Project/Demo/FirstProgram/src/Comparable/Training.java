package Comparable;

import java.awt.List;
import java.util.ListIterator;

public class Training {

	public static void main(String[] args) {

		List names=new LinkedList<>();
		names.add(new Data("Sam"));
		names.add(new Data("Ram"));
		names.add(new Data("Don"));
		names.add(new Data("Pan"));
		names.add(new Data("Era"));

				
		Training obj=new Training();
		obj.printList(names);
		
	}
	private void printList(List names) {
		// TODO Auto-generated method stub
		
	}
	public void printList(List<Data>list) {
		ListIterator<Data>iterator=list.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Element:"+iterator.next());
		}
	}

}
