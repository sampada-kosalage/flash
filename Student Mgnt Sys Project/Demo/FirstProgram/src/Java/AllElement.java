package Java;

import java.util.ArrayList;

public class AllElement {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<String>(); 
		 
		 name.add("Meena");         
		 name.add("Seema");        
		 name.add("Reema");
		 name.add("Zeema");
		 name.add("Teena");         
		 name.add("Weela");
	                 
		 for(String name1:name) {
			 System.out.println(name1);
		 }
	}

}
