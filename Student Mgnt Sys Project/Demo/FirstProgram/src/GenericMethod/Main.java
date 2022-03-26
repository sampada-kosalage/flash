package GenericMethod;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		Data data=new Data();
		System.out.println("printing integer list");
		System.out.println("___________");
		data.printListData(list);
		
		List<String>list2=new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println("printing integer list");
		System.out.println("___________");
		data.printListData(list2);
		
		String[] stringArray= {"one","two","three"};
		Integer[]integerArray= {1,2,3,4};
		System.out.println("printing integer list");
		System.out.println("___________");
		data.printArrayData(integerArray);
		

		Double[]doubleArray= {2.0d,4.0d};
		System.out.println("printing integer list");
		System.out.println("___________");
		data.printArrayData(doubleArray);
	}

}
