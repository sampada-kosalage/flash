package Sets;

import java.util.HashSet;

public class EmptySet {

	public static void main(String[] args) {

		HashSet<String>hashset=new HashSet<String>();
	     hashset.add("Pink");
	     hashset.add("Yellow");
	     hashset.add("brown");
	     hashset.add("white");
	     hashset.add("green");

	     System.out.println("HashSet:"+hashset);
	     hashset.clear();
	     System.out.println("Empty list:"+hashset);

	     
	}

}
