package LinkedList;

import java.util.LinkedList;

public class EmptyOrNot {

	public static void main(String[] args) {
		LinkedList<String>linkedList=new LinkedList<>();
		  
        linkedList.add("Pink");
        linkedList.add("Yellow");
        linkedList.add("White");
        linkedList.add("Green");
        
        System.out.println("linked list:"+linkedList);
        System.out.println("Empty or not!"+linkedList.isEmpty());
        linkedList.removeAll(linkedList);
        System.out.println("After remove all elements"+linkedList);   
        System.out.println("Empty or not!"+linkedList.isEmpty());
 }
	}


