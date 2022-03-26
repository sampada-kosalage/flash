
public class Animal {

	
	private int Height;
	private int Weight;
	private String AnimalType;
	private String BloodType;
	
	  public Animal() {
		  this.Height=6;
		  this.Weight=90;
		  this.AnimalType="vertebrate";
		  this.BloodType="B";
	  }
	  
	  public Animal(int Height,int Weight,String AnimalType,String BloodType) {
	  
	  this.Height=Height;
	  this.Weight=Weight;
	  this.AnimalType=AnimalType;
	  this.BloodType=BloodType;
	
		}
	public int getHeight() {
		return Height;
	}
	public int getWeight() {
		return Weight;
	}
	public String getAnimalType() {
		return AnimalType;
	}
	public String getBloodType() {
		return BloodType;
	}
	
/*public static void main(String [] args)	{
	Animal[] animal=new Animal[6];
	animal[0]=new Reptile();
	animal[0]=new Fish();
	animal[0]=new Bird();
	animal[0]=new Crocodile();
	animal[0]=new Eel();
	animal[0]=new Eagle();

}*/

}
