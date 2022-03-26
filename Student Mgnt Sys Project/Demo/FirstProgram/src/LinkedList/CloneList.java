package LinkedList;

import java.util.LinkedList;

public class CloneList {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		  
        linkedList.add("Pink");
        linkedList.add("Yellow");
        linkedList.add("White");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("Gray");
        
        System.out.println("First LinkedList:" + linkedList);
        
        LinkedList second_list = new LinkedList();
        second_list = (LinkedList) linkedList.clone();
          
        System.out.println("Second LinkedList:" + second_list);
    }
	}


