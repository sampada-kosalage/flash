package Generic9;

import com.sun.jdi.Method;

public class Main {

	public static void main(String[] args) {
		Genericc myPrinter=new Genericc();
        Integer[]intArray={ 1,2,3};
        String[]stringArray={"Hello","World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (java.lang.reflect.Method method:Genericc.class.getDeclaredMethods())
        {
            String name = method.getName();
             if(name.equals("printArray"))
                count++;
        }
        //if(count > 1)
        //System.out.println("Method overloading is not allowed!");
      
    }
	}


