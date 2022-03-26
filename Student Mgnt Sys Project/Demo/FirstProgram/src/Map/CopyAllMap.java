package Map;

import java.util.HashMap;

public class CopyAllMap {

	public static void main(String[] args) {
		HashMap<Integer,String>hashmap=new HashMap<Integer,String>();
		HashMap<Integer,String>hashmap1=new HashMap<Integer,String>();

		hashmap.put(1,"Pink");
		hashmap.put(2,"Yellow");
		hashmap.put(3,"brown");
		hashmap.put(4,"white");
		hashmap.put(5,"green");
		System.out.println("first map: " + hashmap);
		hashmap.put(1,"Pink");
		hashmap.put(2,"Yellow");
		hashmap.put(3,"brown");
		hashmap.put(4,"white");
		hashmap.put(5,"green");
		 System.out.println("second map: " + hashmap1);

		 hashmap1.putAll(hashmap);
		  System.out.println("second map: " + hashmap1);
		 }
	}


