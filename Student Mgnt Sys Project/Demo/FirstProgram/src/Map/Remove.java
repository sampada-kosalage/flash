package Map;

import java.util.HashMap;

public class Remove {

	public static void main(String[] args) {
		HashMap<Integer,String>hashmap=new HashMap<Integer,String>();

		hashmap.put(1,"Pink");
		hashmap.put(2,"Yellow");
		hashmap.put(3,"brown");
		hashmap.put(4,"white");
		hashmap.put(5,"green");
		System.out.println("linked map: " + hashmap);
		hashmap.clear();
		  System.out.println("New map: " + hashmap);
	}

}
