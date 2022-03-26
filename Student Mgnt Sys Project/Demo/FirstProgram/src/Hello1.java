import java.util.Scanner;

public class Hello1 {

	public static void main(String[] args) {
		
		
      System.out.println("Where do you stay");
      /*Scanner sc=new Scanner(System.in);
      String city=sc.nextLine();
      System.out.println("you stay in:"+city);
      sc.close();*/
      
      System.out.println("current variable value"+TestStatic.gerStaticVariable());
	  TestStatic.setStaticVariable(1);
	
	  System.out.println("current variable value"+TestStatic.gerStaticVariable());
	  TestStatic.setStaticVariable(20);
	  
	  System.out.println("current variable value"+TestStatic.gerStaticVariable());
	 
	  
	  Outer.Inner.testingInnerMethod();
	  System.out.println(Outer.Inner.x);
	  
	  //Outer.Inner.testOuterMethod();
	 // System.out.println(Outer.Inner.x);
	}

}
