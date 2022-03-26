package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;

public class Scanner {

	public static void main(String[] args) {

		/*try {
			Scanner sc=new Scanner(new File("IO\\Java.txt"));
			String line;
			while(sc.hashNext()) {
				line=sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		}*/
		
		File file=new File("study.txt");
		if(file.delete()) {
			System.out.println("Delete successfully");
		}
		else {
			System.out.println("error while deleting");
		}
	}
}


