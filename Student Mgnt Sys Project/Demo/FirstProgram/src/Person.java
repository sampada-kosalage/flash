
public abstract class Person implements IsAlive,LiveLife{

	/*private String name ="Sam";
	private int age=27;
	private String gender="Female";
	
	public void setAge(int age) {
		if(age>=0 && age<=100) {
			this.age=age;
			return;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	//public void setAge(int age) {
		//this.age = age;
	//}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}*/
	
	public void speak() {
		System.out.println("this person can speak");
		
	}
	@Override
	public void breadthe() {
		System.out.println("be alive;living");
	}
	
	@Override
	public void message() {
		System.out.println("live your life");
		
	public abstract void eat();
	
}
