
public class Outer {
	
	public static void testOuterMethod() {
		System.out.println("Value of inner class:"+Inner.x);
	}

	public static class Inner{
		public static int x=0;
		public static void testingInnerMethod() {
			System.out.println("Testing inner class method");
		}
		
	}
}
