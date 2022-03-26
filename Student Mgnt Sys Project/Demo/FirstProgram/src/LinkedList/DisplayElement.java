package LinkedList;

import java.util.LinkedList;

public class DisplayElement {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();
		  
        linkedList.add("Pink");
        linkedList.add("Yellow");
        linkedList.add("White");
        linkedList.add("Green");
        
        System.out.println("linked list:" +linkedList);  
        for(int i=0; i < linkedList.size();i++)
         {
         System.out.println("Element"+i+":"+linkedList.get(i));
        } 
	}

}
