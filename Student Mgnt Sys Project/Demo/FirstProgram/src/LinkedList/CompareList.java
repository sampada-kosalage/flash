package LinkedList;

import java.util.LinkedList;

public class CompareList {

	public static void main(String[] args) {

		LinkedList<String> linkedList1 = new LinkedList<>();
		  
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        linkedList1.add("White");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("Gray");

        LinkedList<String> linkedList2 = new LinkedList<>();
		  
        linkedList2.add("Pink");
        linkedList2.add("Yellow");
        linkedList2.add("White");
        linkedList2.add("Green");
        
        LinkedList<String> linkedList3 = new LinkedList<String>();
        for (String e : linkedList1)
        	linkedList3.add(linkedList2.contains(e)?"LinkedList1":"LinkedList2");
        System.out.println(linkedList3);         
   }
	}


