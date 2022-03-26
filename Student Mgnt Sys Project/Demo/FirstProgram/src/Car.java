
public class Car extends Vehicle{
/*private String doors;
private String engine;
private String driver;
private int speed;


public Car() {
	doors="closed";
	engine="on";
	driver="yes";
	speed=10;
	
}*/
	public String steering;
	public String music;
	public String aircon;
	public String entUnit;
	
	
	public Car(){
		super();
		this.steering="Power Steering";
	}
	public Car(String steering,String enginee,int wheels,int seats,int fuelTank,String lights);
    super(enginee,wheels,seats,fuelTank,lifhts);
    this.steering=steering;

public String getSteering() {
	return steering;
}

}

}


