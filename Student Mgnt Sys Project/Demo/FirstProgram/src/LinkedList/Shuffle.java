package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class Shuffle {

	public static void main(String[] args) {
		LinkedList<Object> linkedList = new LinkedList<>();
		  
        linkedList.add("Pink");
        linkedList.add("Yellow");
        linkedList.add("White");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("Gray");
	
        System.out.println("The list before shuffle:"+linkedList.toString());
        System.out.println();
        Object[] array = linkedList.toArray();

       arrayShuffle(array);
       listDataAdder(array, linkedList);
       System.out.println("The list after shuffle:"+linkedList.toString());
       System.out.println();

	}
	static void listDataAdder(Object[] arr,
            LinkedList<Object> list)
{
ListIterator<Object> it = list.listIterator();
for (Object e : arr) 
{
it.next();
it.set(e);
}
}
static void arrayShuffle(Object[] arr)
{
    Random rand = new Random();
    for (int i = 0; i < arr.length - 1; i++) {
        
       int index = rand.nextInt(i + 1);
        Object g = arr[index];
        arr[index] = arr[i];
        arr[i] = g;
    }
}

	

}
