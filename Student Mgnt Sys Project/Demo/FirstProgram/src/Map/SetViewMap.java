package Map;

import java.util.HashMap;
import java.util.Set;

public class SetViewMap {

	public static void main(String[] args) {
		HashMap<Integer,String>hashmap=new HashMap<Integer,String>();

		hashmap.put(1,"Pink");
		hashmap.put(2,"Yellow");
		hashmap.put(3,"brown");
		hashmap.put(4,"white");
		hashmap.put(5,"green");
		Set keyset = hashmap.keySet();
	      
		   System.out.println("Key set values are: " + keyset);  
		 }
		
	}

