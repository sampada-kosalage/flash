package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class Mapp {

	public static void main(String[] args) {
 
		Map<Code,String>student=new TreeMap<>();
		student.put(new Code("S01","L03"),"Generics");
		student.put(new Code("S02","L01"),"OOP");
		student.put(new Code("S03","L02"),"MAth");
		student.put(new Code("S04","L04"),"Filehandling");
		student.put(new Code("S05","L05"),"Collection");

		Code code=null;
		
		
		for(Map.Entry<Code,String>entry:student.entrySet()) {
			/*if(entry.getValue().equals("OOPS")) {
				code=entry.getKey();
				}
			}
		System.out.println("The key for the value\"OOPS":"+code);
		}*/
		/*for(Map.Entry<Integer,String>entry:student.entrySet()) {
			System.out.println("Key:"+entry.getValue()+"Value:"+entry.getValue());
		}
		//System.out.println(student.get(3));
		Iterator<Entry<Integer,String>>entry=student.entrySet().iterator();
		while(entry .hasNext())
			Entry<Integer,String>temp=entry.next();
		System.out.println("Key:"+temp.getKey()+"Value:"+temp.getValue());
	}*/

}
		Code code1=new Code("S01","L02");
		Code code2=new Code("S01","L02")
