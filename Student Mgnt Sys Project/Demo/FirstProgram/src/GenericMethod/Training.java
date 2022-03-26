package GenericMethod;

public class Training {

	public static void main(String[] args) {

		Data <Integer,Training>data=new Data<Integer,Training>(1,"Sam");
		data.display("$",1);
		data.getValue().test();
		System.out.println(data.getKey());
		
	}
	public void test() {
		System.out.println("Testing..............");
	}

}
