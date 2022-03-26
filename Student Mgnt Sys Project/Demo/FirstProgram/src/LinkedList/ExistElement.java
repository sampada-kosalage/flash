package LinkedList;

import java.util.LinkedList;

public class ExistElement {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();
		  
        linkedList.add("Pink");
        linkedList.add("Yellow");
        linkedList.add("White");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("Gray");
        
        if (linkedList.contains("White")) {
            System.out.println("White is present in List");
         } else {
            System.out.println("Doesn't have element White");
          }
         
         if (linkedList.contains("Brown")) {
            System.out.println("Brown is present in List");
         } else {
             System.out.println("Doesn't have element Brown");
           }
	}

}
