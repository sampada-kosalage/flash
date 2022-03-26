
public class Car1 {
	private String doors;
	private String engine;
	private String driver;
	public int speed;
	
	public String run()
	{
		if(doors.equals("closed"))&& engine.equals("on")&& drivers.equals("yes")&& speed>0
	return "car1 is running";
	}else{
		return "Car1 is not running";
	}
}
	public void setspeed(int speed) {
		this.speed=speed;
	}
	public int getspeed() {
		return speed;
	}
	public void setdoors(int speed) {
		this.doors=doors;
	}
	public String getdoors() {
		return doors;
	}
	public void setengine(int speed) {
		this.engine=engine;
	}
	public String getengine() {
		return engine;
	}
	public void setdriver(int speed) {
		this.driver=driver;
	}
	public String getdriver() {
		return driver;
	}
	
}
