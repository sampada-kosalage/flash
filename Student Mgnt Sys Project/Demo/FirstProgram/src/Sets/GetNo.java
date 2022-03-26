package Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GetNo {

	public static void main(String[] args) {

		String strArr[] = { "Sam", "Ram", "Pandy" };
	      Set s = new HashSet(Arrays.asList(strArr));
	      System.out.println("Elements:"+s);
	      System.out.println("Elements: "+s.size());
	   }
	}


