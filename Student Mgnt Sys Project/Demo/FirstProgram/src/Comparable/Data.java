package Comparable;

import java.util.jar.Attributes.Name;

public class Data implements Comparable<Name>{

	

	public Data(String name) {
		super();
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}
	public int compareTo(Data obj) {
		if(name.length()==obj.name.length()){
			return 0;
			}
		else if(name.length()<obj.name.length()) {
				return -1;
			
		}else {
			return 1;
		}
	}

	@Override
	public int compareTo(Name o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
