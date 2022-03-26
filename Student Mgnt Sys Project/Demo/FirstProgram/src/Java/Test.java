package Java;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {

		ArrayList<String>c=new ArrayList<>();
		c.add("Red");
		c.add("Blue");
        c.add("Pink");
		c.add("Green");
		c.add("White");
	    System.out.println("color");
        System.out.println("------");
        Test t= new Test();
        t.display(c);
        System.out.println("------");
        System.out.println(c.get(3));
        System.out.println("------");
        c.set(4,"Green");
        t.display(c);
        System.out.println("------");
        c.remove(3);
        t.display(c);
        System.out.println("------");

 		//c.add(1,"black");
	    //System.out.println("----Itterate----");

        if(c.contains(4)) {
        	System.out.println(c.get(4));
            System.out.println("------");
          Collections.sort(c);
          t.display(c);
        }
        
        
	}
	

	private void display(ArrayList<String> c) {
		// TODO Auto-generated method stub
		
	}

}
