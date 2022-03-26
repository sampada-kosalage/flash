package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedtoArray {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();
		  
        linkedList.add("Pink");
        linkedList.add("Yellow");
        linkedList.add("White");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("Gray");
	
        List<String> list = new ArrayList<String>(linkedList);

        for (String str : list)
        {
        System.out.println(str);
        }
	}
	

}
