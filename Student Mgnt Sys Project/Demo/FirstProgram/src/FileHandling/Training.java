package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Training {

	public static void main(String[] args) throws IOException{

		/*File file=new File("c:\\Sam\\/Study.txt");
		file.createNewFile();
		System.out.println("File created");
		
	}*/
	/*File directory=new File("Study");
	directory.mkdir();
	File directory=new File("c:\\sam\\study\\java");
	subDirectory.mkdir();
	System.out.println("directory created");*/

	File directory=new File("Study.txt");
	directory.mkdir();
    File file=new File("IO\\java.txt");
    try {
    	file.createNewFile();
    	System.out.println("File created");
    }catch(IOException e) {
    	System.out.println(e.getMessage());
    }
    try(BufferedWriter bw=new BufferedWriter(new FileWriter(file,true))){;
	        bw.write("Sam");
            bw.newLine();
            bw.write("Ram");
            bw.newLine();
    		bw.write("Ram");
    	    bw.newLine();
    		bw.write("Ram");
    	    bw.newLine();
    		System.out.println("writing completed");
            bw.close();
     }
	catch(IOException e) {
		System.out.println(e.getMessage());
	}
    
    try {
    	BufferReader br=new BufferReade(new FileReader("IO\\java.txt"));{
    		String line;
    		System.out.println("***********");
    		
    	}
    
    }
	

	}
}

