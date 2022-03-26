package Sets;

import java.util.HashSet;
import java.util.TreeSet;

public class HashToTree {

	public static void main(String[] args) {
		HashSet<String>hashset=new HashSet<String>();
	     hashset.add("Pink");
	     hashset.add("Yellow");
	     hashset.add("brown");
	     hashset.add("white");
	     hashset.add("green");
	     System.out.println("HashSet:"+hashset);
         TreeSet<String> hashSetToTree= new TreeSet<>(hashset);
         System.out.println("TreeSet:"+hashSetToTree);
}
	}


