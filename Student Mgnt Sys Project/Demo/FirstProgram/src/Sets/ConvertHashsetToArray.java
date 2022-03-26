package Sets;

import java.util.HashSet;

public class ConvertHashsetToArray {

	public static void main(String[] args) {
		HashSet<String>hashset=new HashSet<String>();
	     hashset.add("Pink");
	     hashset.add("Yellow");
	     hashset.add("brown");
	     hashset.add("white");
	     hashset.add("green");
	     System.out.println("Hash Set Contains :" + hashset);
	        String arr[] = new String[hashset.size()];
	        int i=0;
	        
	        for(String ele:hashset){
	          arr[i++] = ele;
	        }
	         for (String n : arr)
	            System.out.println(n);
	    }    
	}


