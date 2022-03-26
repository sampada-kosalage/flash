package LinkedList;

import java.util.LinkedList;

public class Swap {

	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<>();
		  
		linkedList.add(8);
		linkedList.add(2);
		linkedList.add(10);
		linkedList.add(7);
		linkedList.add(5);
		linkedList.add(6);
  
        int element1 = 5;
        int element2 = 6;
        
        System.out.println("Linked List Before Swapping :-");
        for (int i : linkedList) {
            System.out.print(i + " ");
        }
        swap(linkedList, element1, element2);
        System.out.println();
        System.out.println();
  
        System.out.println("Linked List After Swapping :-");
        for (int i : linkedList) {
            System.out.print(i + " ");
        }
    }
  public static void swap(LinkedList<Integer> list,int e1, int e2)
    {
        int index1 = list.indexOf(e1);
        int index2 = list.indexOf(e2);
     
        if (index1 == -1 || index2 == -1) {
            return;
        }
        list.set(index1, e2);
        list.set(index2, e1);
    }
	}


