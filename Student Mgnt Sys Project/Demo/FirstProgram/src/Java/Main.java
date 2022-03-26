package Java;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String>c=new ArrayList<>();
		c.add("Red");
		c.add("Blue");
        c.add("Pink");
		c.add("Green");
		c.add("White");
	    System.out.println("----color----");
        System.out.println(c);
 		c.add(1,"black");
	    System.out.println("----Itterate----");

	for(String color:c) {
		System.out.println(color);
	}
    System.out.println("----At a specified index----");
	System.out.println(c.get(2));
	}

}

