package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int firstIndex, secondIndex;
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> intList = new ArrayList<>();

        for(int i = 1; i< 10; i++){
            intList.add(i);
        }

        System.out.println("Enter the first:");
        firstIndex = sc.nextInt();

        System.out.println("Enter the second:");
        secondIndex = sc.nextInt();

        System.out.println("before swap : "+intList);

        Collections.swap(intList, firstIndex, secondIndex);
        System.out.println("after swap : "+intList);
    }

	}


