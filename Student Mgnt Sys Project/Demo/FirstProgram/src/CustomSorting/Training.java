package CustomSorting;

import java.util.TreeSet;

public class Training {

	public static void main(String[] args) {

		Comparator<Data<Integer,String>>COMPARE_NAME_LENGTH=new Comparator<Data<Integer,String>>;
	
		@Override
	public int compare(Data<Integer,String>obj1,Data<Integer,String>obj2);
	if(obj1.getValue().length()<obj2.getValue().length()) {
		return -1;
	}else if(obj1.getValue().length()>obj2.getValue().length()) {
		return 1;
	}else
		return 0;
	}
};
	Set<Data<Integer,String>>set=new TreeSet<>(COMPARE_KEY);
	set.add(new Data<Integer,String>(1,"Sam"));
	set.add(new Data<Integer,String>(2,"Dam"));
	set.add(new Data<Integer,String>(3,"pan"));
	set.add(new Data<Integer,String>(4,"Ram"));
	set.add(new Data<Integer,String>(5,"Dem"));

	for(Data<Integer,String>element:set) {
		System.out.println(element);
	}
}
}
