package Java;

import java.util.ArrayList;
import java.util.Collections;

public class ReplaceElement {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>(); 
		 
		 name.add("Meena");         
		 name.add("Seema");        
		 name.add("Reema");
		 name.add("Zeema");
		 name.add("Teena");         
		 name.add("Weela");
	                 
	     //System.out.println("ArrayList before repalce:"+name);         

	         
	     name.set(2,"Sampada");
	     System.out.print("ArrayList after repalce:"+name);         

	}
	}


