package LinkedList;

import java.util.LinkedList;

public class RepalceElement {

	public static void main(String[] args) {

		LinkedList<String>linkedList=new LinkedList<>();
		  
        linkedList.add("Pink");
        linkedList.add("Yellow");
        linkedList.add("White");
        linkedList.add("Green");
        
        System.out.println("linked list:"+linkedList);
        linkedList.set(2,"Skyblue");
        System.out.println("The value changed");
        System.out.println("linked list:"+linkedList);
 }
	}


