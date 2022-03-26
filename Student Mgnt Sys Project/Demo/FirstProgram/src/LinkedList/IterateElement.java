package LinkedList;

import java.util.LinkedList;

public class IterateElement {

	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<>();
		  
        linkedList.add(40);
        linkedList.add(44);
        linkedList.add(80);
        linkedList.add(9);
        iterateUsingForLoop(linkedList);
        
	}
        public static void iterateUsingForLoop(LinkedList<Integer> linkedList)
{

   System.out.print("Iterating the LinkedList:");

   for (int i = 0; i < linkedList.size(); i++) {
       System.out.print(linkedList.get(i) + " ");
   }

    }
	}



