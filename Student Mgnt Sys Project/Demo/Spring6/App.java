
public class App {

	public static void main(String [] args) {
		Car swift=new Swift();
		Car corolla=new Corolla();
		
		
		System.out.println(swift.spects());
		System.out.println(Corolla.spects());

		
		//Car myCar=new Swift();
		//System.out.println(myCar.spects());

		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar=context.getBeans("myCorolla",Car.class);
		System.out.println(myCar.spects());
		context.close();
	}
}
