package Map;

import java.util.HashMap;

public class Shollow {

	public static void main(String[] args) {
		HashMap<Integer,String>hashmap=new HashMap<Integer,String>();

		hashmap.put(1,"Pink");
		hashmap.put(2,"Yellow");
		hashmap.put(3,"brown");
		hashmap.put(4,"white");
		hashmap.put(5,"green");
		
		System.out.println("Map: " + hashmap);
		HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>(); 
		new_hash_map = (HashMap)hashmap.clone();     
		System.out.println("Cloned map: " + new_hash_map);        
		     }
	}


