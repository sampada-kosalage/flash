package Comparable;

import java.util.ArrayList;
import java.util.List;

public class Training1 {

	public static void main(String[] args) {

		List<Object>list=new ArrayList<>();
		list.add(new Vahicle(10));
		list.add(new Vahicle(11));
		list.add(new Vahicle(12));
		list.add(new Vahicle(13));
		list.add(new Vahicle(14));
		list.add(new Car(15,"X1"));
       display(list);
       
	}
	public static void display(List<Object> list) {
		for(Object element:list) {
			//((Vahicle) element).info();
			//System.out.println(element);
			
		}
	}

}
