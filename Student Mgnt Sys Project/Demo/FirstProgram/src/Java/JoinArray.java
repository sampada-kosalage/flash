package Java;

import java.util.ArrayList;
import java.util.Arrays;

public class JoinArray {

	public static void main(String[] args) {
		 ArrayList<String> listOne = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
         
	        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("F", "J", "K", "K", "M"));
	         
	        listOne.addAll(listTwo); 
	         
	        System.out.println(listOne);
	    }
	}


