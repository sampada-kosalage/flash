package LinkedList;

import java.util.LinkedList;

public class InsertElement {

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
		System.out.println("Adding an element at start:"); 
		System.out.println(linkedList);
		linkedList.addLast("Kosalage");
		 
		System.out.println("Adding an element at end:"); 
		System.out.println(linkedList); 
		 }

	}


