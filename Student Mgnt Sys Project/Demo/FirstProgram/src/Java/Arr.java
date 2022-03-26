package Java;

import ExceptionHandling.Training;

public class Arr {

	
	public static void main(String[] args) {
    //int [] intVariableArray= {1,2,3,4,5,6,7,8,9,10};
    String [] names= {"Sam","Pritam","Meena","Pu"};
    
    Training obj=new Training();
    obj.displayNames(names);
    System.out.println("_____________");
    System.out.println(names[0]);

    //float [] floatVariableArray= {0.0f,1.0f,2.0f,3.0f};
     try {
    	//for(String name:StringArray) {
    		//System.out.println(name);
    	//}
    	//for(int i=0;i<=StringArray.length-1;i++)
    	//System.out.println(StringArray[5]);
        //System.out.println(floatVariableArray[2]);
    	
    }catch(Exception e) {
    	 System.out.println(e.getMessage());
    	 
    }
		
	}
	void displayName(String[] names) {
		for(String name:names) {
    		System.out.println(name);
	}
		names[0]="Ram";
	}

}
