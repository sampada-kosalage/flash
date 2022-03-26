package ExceptionHandling;

import java.util.ArrayList;
import java.util.Arrays;

public class Iterator {

	ArrayList<Integer> javaIterator(int n,int k,int[] arr) {
		Arrays.sort(arr); 
		ArrayList<Integer> sortedList = new ArrayList<Integer>();

		for(int i = 0 ; i < n ; i++){
		sortedList.add(arr[i]);
		}

		java.util.Iterator<Integer> it = sortedList.iterator();

		while(it.hasNext()) {
		int value = (int) it.next();

		if( value < k)
		it.remove();
		}

		return sortedList;
	}
}
