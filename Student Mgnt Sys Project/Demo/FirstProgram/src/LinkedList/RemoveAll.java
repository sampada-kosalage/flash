package LinkedList;

import java.util.LinkedList;

public class RemoveAll {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();
		  
        linkedList.add("Pink");
        linkedList.add("Yellow");
        linkedList.add("White");
        linkedList.add("Green");
        
        System.out.println("LinkedList:" + linkedList);
        
        linkedList.clear();
  
        System.out.println("After clearing elements:" +linkedList);
	}

}
