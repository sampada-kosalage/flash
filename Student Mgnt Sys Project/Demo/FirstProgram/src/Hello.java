import java.math.BigDecimal;

public class Hello {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
     //int value=100;
     //int value2=3;
	 //float var1=3.3f;
     //float var2=3.3f;
     //float var3=3.3f;
     //double var3=2.5567d;
     //double var4=3.6547d;
		//int var1=1,var3=1,var4=(3+4)-1;
     //int var2=var1;
     //int shortByte=32868;
     //String name="Sampada";
    // float var2=1.2f;
     //double var3=1.5d;
     /*System.out.println("----Normal Print----");
     System.out.println(2.00-1.1);
     System.out.println(2.00-1.2);
     System.out.println(2.00-1.3);
     System.out.println(2.00-1.4);
     System.out.println(2.00-1.5);
     System.out.println(2.00-1.6);
     System.out.println(2.00-1.7);
     System.out.println("----BigDecimal Usage Print----");
     System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.1")));
     System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.2")));
     System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.3")));
     System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.4")));
     System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.5")));
     System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.6")));
     System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.7")));

		//System.out.println(value/value2);
	}*/
/*Bike bike new Bike();
bike.handle="long";
bike.engine="petrol";
System.out.println(bike.engine);*/

		
//Laptop lappy=new Laptop();
//System.out.println(lappy.getProcessor().getBrand());


//polymorphism

/*SmartPhone note10=new SamsungNote10("Note 10");
System.out.println(note10.getmodel());
note10.features();

SmartPhone iphone=new SmartPhone("Iphone 13");
System.out.println(iphone.getmodel);
iphone.features();
	}*/
		Person sam=new Vegan();
		sam.speak();
		sam.eat();
		sam.breathe();
		sam.message();
		
		
		Person doe=new Nonvegan();
		doe.speak();
		doe.eat();
		doe.breathe();
		doe.message();

}
}
