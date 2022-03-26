package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateStart {

	public static void main(String[] args) {
		LinkedList<Object> linkedList = new LinkedList<>();
		  
        linkedList.add("Pink");
        linkedList.add("Yellow");
        linkedList.add("White");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("Gray");
	
        Iterator I = linkedList.listIterator(1);

        while (I.hasNext()) {
        System.out.println(I.next());
        }
        }
	}


