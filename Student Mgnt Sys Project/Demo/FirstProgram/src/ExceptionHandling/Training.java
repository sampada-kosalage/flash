package ExceptionHandling;

import java.util.ArrayList;
import java.util.LinkedList;

public class Training {

	public static void main(String[] args) {
		//int x=0;
		int x=2;

		try {
			System.out.println("we dont know what will be output"+x/2);
		}
		catch(ArithmeticException e){
			System.out.println("Arithmatic exception occured");
		}
		catch(RuntimeException e){
			System.out.println("Runtime");
		}
		catch(Exception e){
			System.out.println("Exception");
		}
		finally {
			System.out.println("In finally block");
		}
	}

	public void displayNames(ArrayList<String> listNames) {
		// TODO Auto-generated method stub
		
	}

	public void removeNameByString(String string) {
		// TODO Auto-generated method stub
		
	}

	public void modifyName(int position, String string) {
		// TODO Auto-generated method stub
		
	}

	public int search(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void printList(LinkedList<String> countries) {
		// TODO Auto-generated method stub
		
	}
}
		/*Hello obj=new Hello();
		obj.case2(10,0);
	}
	
	public void case1(int x,int y) {
		if(y!=0) {
			System.out.println(x/y);
		}
		else
		{
			System.out.println("Value of y is 0");
		}
	}
	public void case2(int x,int y) {
		try {
			System.out.println(x/y);
		}
		catch(Exception e){
			System.out.println(" The value of y is 0");
		}
			
		}*/
	


