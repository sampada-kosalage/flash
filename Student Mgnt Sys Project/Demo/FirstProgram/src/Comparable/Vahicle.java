package Comparable;

public class Vahicle {

	public Vahicle(int vehicleId) {
		super();
		VehicleId = vehicleId;
	}

	private int VehicleId;

	public int getVehicleId() {
		return VehicleId;
	}

	public void setVehicleId(int vehicleId) {
		VehicleId = vehicleId;
	}

	@Override
	public String toString() {
		return "Vahicle [VehicleId=" + VehicleId + "]";
	}
	void info() {
		System.out.println("Vahicle ID is"+getVehicleId());
	}
}
