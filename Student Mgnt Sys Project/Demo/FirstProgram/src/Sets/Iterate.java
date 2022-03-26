package Sets;

import java.util.HashSet;
import java.util.Iterator;

public class Iterate {

	public static void main(String[] args) {
		HashSet<Integer>hashset=new HashSet<>();
		
		hashset.add(1);
		hashset.add(2);
		
		hashset.add(1);
		hashset.add(3);

		hashset.add(3);
		Iterator<Integer>it=hashset.iterator();
		  
        System.out.println("Iterate HashSet using iterator:");
        while (it.hasNext()) 
        {
        System.out.print(it.next()+" ");
        }
    }

	}

