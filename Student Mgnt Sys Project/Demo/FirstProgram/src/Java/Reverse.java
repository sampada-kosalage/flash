package Java;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

	public static void main(String[] args) {
		 ArrayList<String> name = new ArrayList<String>(); 
		 
		 name.add("Meena");         
		 name.add("Seema");        
		 name.add("Reema");
		 name.add("Zeema");
		 name.add("Teena");         
		 name.add("Weela");
	                 
	     Collections.reverse(name);
	         
	     System.out.print("Reverse ArrayList:");         
	     System.out.println(name);
	}

}
