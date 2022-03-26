package Java;

import java.util.ArrayList;
import java.util.Collections;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>c=new ArrayList<>();
		c.add("Red");
		c.add("Blue");
        c.add("Pink");
		c.add("Green");
		c.add("White");
		
		ArrayList<String>list=new ArrayList<>();
        list.add("monkey");
        list.add("donkey");
        list.add("mouse");
        list.add("Rat");
        list.add("Peocock");

    Collections.copy(c,list);
    System.out.println(c);
	}

}
