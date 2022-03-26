package LinkedList;

import java.util.LinkedList;

public class FirstElement {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();
		  
		linkedList.add("Sam");
		linkedList.add("Ram");
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");
		System.out.println("linked list:"); 
		System.out.println(linkedList); 
		linkedList.addFirst("Sampada");
		System.out.println("Adding an element at first:"); 
		System.out.println(linkedList);
	}

}
