package Sets;

import java.util.HashSet;
import java.util.Set;

public class Addset {

	public static void main(String[] args) {
     Set<String>set=new HashSet<>();
     
     for(int i=30;i>0;i--) {
    	 set.add("A"+i);
    	 
     }
     for(String i:set) {
    	 System.out.println(i);
     }
	}

}
