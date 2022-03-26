package Comparable;

public class Car extends Vahicle{

	
	public Car(int vehicleId, String carModel) {
		super(vehicleId);
		CarModel = carModel;
	}

	private String CarModel;

	public String getCarModel() {
		return CarModel;
	}

	public void setCarModel(String carModel) {
		CarModel = carModel;
	}

	@Override
	public String toString() {
		return "Car [CarModel=" + CarModel + "]";
	}
	@Override
	void info() {
		System.out.println("Vahicle ID is"+getVehicleId());
	}
	
}
