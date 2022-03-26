package Map;

import java.util.HashMap;

public class GetVAlue {

	public static void main(String[] args) {
		HashMap<Integer,String>hashmap=new HashMap<Integer,String>();

		hashmap.put(1,"Pink");
		hashmap.put(2,"Yellow");
		hashmap.put(3,"brown");
		hashmap.put(4,"white");
		hashmap.put(5,"green");
		 System.out.println("Initial Mappings are: " + hashmap);
		  
	        System.out.println("The Value is: " + hashmap.get(5));
	  
	        System.out.println("The Value is: " + hashmap.get(1));
	    }
	}


