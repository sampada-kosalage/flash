package LinkedList;

import java.util.LinkedList;

public class RemoveElement {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();
		  
        linkedList.add("Pink");
        linkedList.add("Yellow");
        linkedList.add("White");
        linkedList.add("Green");
        
		System.out.println("LinkedList:\t" + linkedList);
        
        System.out.println("last element is removed:\t" + linkedList.removeLast());
          
        System.out.println("Final LinkedList:\t" + linkedList);
          
        System.out.println("first element is removed:\t" + linkedList.removeFirst());
  
        System.out.println("Final LinkedList:\t" + linkedList);
    }
	}


