package Sets;

import java.util.HashSet;
import java.util.Set;

public class Training {

	public static void main(String[] args) {

		Set<String>set=new HashSet<>();
		set.add("Sam");
		set.add("rahul");
		set.add("ram");
		set.add("pi");

		for(String name:set) {
			System.out.println(name);
		}
		System.out.println(set.contains(1));
	}

}
