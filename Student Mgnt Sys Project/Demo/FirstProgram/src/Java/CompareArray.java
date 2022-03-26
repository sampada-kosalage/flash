package Java;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareArray {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
         
        list1.retainAll(list2);
         
        System.out.println(list1);
    }
	}


