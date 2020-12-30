package amrib.designPattern.factory.vehicule;

public class VehicleFactory {

	public Vehicle getFactory(String vehicleType) throws VehicleTypeNotFoundException {
		Vehicle vehicle = null;
		if (vehicleType == null)
			return null;
		else if (vehicleType == "car") {
			vehicle = new Car();
		} else if (vehicleType == "truck") {
			vehicle = new Car();
		} else if (vehicleType == "motorcycle") {
			vehicle = new Car();
		} else {
			throw new VehicleTypeNotFoundException();
		}
		return vehicle;
	}

}
