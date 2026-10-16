package project;

public class Driver extends Person implements IDriver {
	private String vehiclePlate;
	private VehicleType vehicleType;

	public Driver(int id, String name, String phoneNumber, String vehiclePlate, VehicleType vehicleType) {
		super(id, name, phoneNumber);
		setVehiclePlate(vehiclePlate);
		this.vehicleType = vehicleType;
	}

	@Override
	public String getVehiclePlate() {
		return vehiclePlate;
	}

	@Override
	public void setVehiclePlate(String vehiclePlate) {
		if (vehiclePlate == null || !vehiclePlate.matches("[A-Z]{3}\\d{4}")) {
			throw new IllegalArgumentException("Vehicle plate must be 3 uppercase letters followed by 4 digits: " + vehiclePlate);
		}
		this.vehiclePlate = vehiclePlate;
	}

	@Override
	public VehicleType getVehicleType() {
		return vehicleType;
	}

	@Override
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public int compareTo(IDriver other) {
		return Integer.compare(getId(), other.getId());
	}

	@Override
	public String toString() {
		return "Driver " + getId() + ": " + getName() + ", " + getPhoneNumber() + ", " + vehiclePlate + ", " + vehicleType;
	}
}
