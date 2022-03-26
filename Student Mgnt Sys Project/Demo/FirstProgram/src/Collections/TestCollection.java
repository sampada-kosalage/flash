package Collections;

import java.util.ArrayList;

import ExceptionHandling.Training;

public class TestCollection {

	static ArrayList<String> ListNames=new ArrayList<>();
	
	public static void main(String [] args) {
		ArrayList <intWrapper> studentNumbers=new ArrayList<>();
		ArrayList <Integer> demoListInteger=new ArrayList<>();
        demoListInteger.add(10);
        System.out.println(demoListInteger.get(0));
        
        ArrayList <float> demoListfloat=new ArrayList<>();
        demoListfloat.add(10.0f);
        System.out.println(demoListInteger.get(0));
        
		/*demoList.add(25.5d);
		demoList.add(Double.vlaueOf(10.0));
		System.out.println(demoList.get(0).double());
		studentNumbers.add(new intWrappet(12));
		System.out.println(studentNumber.get(0).getIntValue());
		
		/*ListNames.add("Sam");
		ListNames.add("Man");
		ListNames.add("Ram");
		ListNames.add("Ri");
		ListNames.add("Priya");
		ListNames.add("Sampada");
		
		System.out.println(ListNames);
		
		Training obj=new Training();
        obj.displayNames(ListNames);
        
        System.out.println("_______________");
        int position=obj.search("Sam");
        if(position!=-1) {
        	obj.modifyName(position,"priya");
        	obj.displayNames(ListNames);
        }
        else {
        	System.out.println("Invalide entry");
        }
        /*obj.removeNameByString("Ri");
        obj.displayNames(ListNames);
        System.out.println("_______________");
        System.out.println(ListNames.get(3));*/

	//}
	/*void displayList(ArrayList<String>names) {
		for(String name:names) {
			System.out.println(name);
		}
	}
	void modifyNameByPosition(int position,String newName) {
		ListNames.set(position,newName);
	}
	//void removeNameByString(String name) {
		//ListNames.remove(name);
//}
	int search(String name) {
		return ListNames.indexOf(name);
	}
}*/
	}
}
