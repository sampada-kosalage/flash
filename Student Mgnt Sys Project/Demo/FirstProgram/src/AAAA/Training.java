package AAAA;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import javax.xml.crypto.Data;

public class Training {

	public static void main(String[] args) {

		//Generic data=new Data("String");
		List<Data><Object>element new LinkedList<>();
		elements.add(new Data<Object>("String"));
		elements.add(new Data<Object>(1));
		elements.add(new Data<Object>(1.0f));
		elements.add(new Data<Object>(2.35d));
		elements.add(new Data<Object>('%'));

		//String variable=(String) data.getObj();
		//System.out.println(variable);
		
		Training obj=new Training();
		obj.printList(elememts);
	}
	
	void printList(List<Data<Object>>List) {
		ListIterator<Data<Object>>Iterator=List.ListIterator();
		while(Iterator.hasNext()) {
			System.out.println("Element:"+Iterator.next());
		}
	}

}
