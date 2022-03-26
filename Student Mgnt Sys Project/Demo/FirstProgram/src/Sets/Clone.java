package Sets;

import java.util.HashSet;

public class Clone {

	public static void main(String[] args) {
		HashSet<String>hashset=new HashSet<String>();
	     hashset.add("Pink");
	     hashset.add("Yellow");
	     hashset.add("brown");
	     hashset.add("white");
	     hashset.add("green");

	    System.out.println("HashSet:" + hashset);
	    HashSet cloned_set = new HashSet();
	    cloned_set = (HashSet)hashset.clone();
	    System.out.println("new set:" + cloned_set);
	    }
	}


