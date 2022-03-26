package Map;

import java.util.HashMap;

public class HashKey {

	public static void main(String[] args) {
		HashMap<Integer,String>hashmap=new HashMap<Integer,String>();

		hashmap.put(1,"Pink");
		hashmap.put(2,"Yellow");
		hashmap.put(3,"brown");
		hashmap.put(4,"white");
		hashmap.put(5,"green");
		
		System.out.println("Map:" + hashmap);
		  System.out.println("1.value \'Green\' exists?");
		  if (hashmap.containsValue("Green")) 
		  {
		   System.out.println("Yes");
		  } 
		  else 
		  {
		   System.out.println("no");
		  }

		  System.out.println("\n2. Is value 'pink' exists?");
		  if (hashmap.containsValue("Pink")) 
		  {
		   System.out.println("yes" );
		  } 
		  else 
		  {
		   System.out.println("No");
		  }
		 }
	}


