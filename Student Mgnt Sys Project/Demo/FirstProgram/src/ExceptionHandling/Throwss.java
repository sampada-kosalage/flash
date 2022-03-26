package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throwss {

	public static void main(String[] args) {

		try {
			someMethod();
		}catch(FileNotFoundException e) {
          System.out.println("e.getMessage");
			}catch(UserDefineException e) {
				e.printStackTrace();
			}catch(Exception e) {
				System.out.println("Main Exception");
			}

	}

	
	public static void someMethod() throws Exception,FileNotFoundException,UserDefineException{
		//try {
			FileReader in=new FileReader("file.txt");
			//throw new FileNotFoundException();
			//System.out.println("somemethod");
		//}
	
	//catch(FileNotFoundException e){
			//System.out.println("Message from catch block");
		//}
		//finally {
			//System.out.println("somemethod");
		//}
		//System.out.println("Message from someMethod");
		//throw new FileNotFoundException();
		int x=3;
		Switch(x){
			case1:
				throw new FileNotFoundException();
			case2:
				throw new UserDefineException();
			case3:
				throw new Exception();


		}
	

	

