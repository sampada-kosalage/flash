
public class Vahicle {

	private String engine;
private int wheels;
private int seats;
private String light;
private int fueltank;

  public Vahicle() {
	  this.engine="petrol";
	  this.wheels=4;
	  this.seats=4;
	  this.fueltank=35;
	  this.light="LED";
  }
  
  public Vahicle(String engine,int wheel,int seats,int fueltank,String light) {
  
  this.engine=engine;
  this.wheels=wheels;
  this.seats=seats;
  this.fueltank=fueltank;
  this.light="light";
	}
public String getEngine() {
	return engine;
}
public int getWheels() {
	return Wheels;
}
public int getseats() {
	return seats;
}
public int getfuelTank() {
	return fuelTank;
}
public String getlight() {
	return light;
}




}




