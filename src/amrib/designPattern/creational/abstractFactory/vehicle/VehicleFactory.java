package amrib.designPattern.creational.abstractFactory.vehicle;

import amrib.designPattern.creational.factory.vehicle.VehicleTypeNotFoundException;

public abstract class VehicleFactory {

	public static CarFactory carFactory = null;
	public static TruckMotor truckMotor = null;

	public abstract Motor getMotor();

	public abstract Pneu getPneu();

	VehicleFactory vehicleFactory = null;

	public VehicleFactory getFactory(String factoryType) throws VehicleTypeNotFoundException {
		if (factoryType == null) {
			return null;
		} else if (factoryType == "motor") {
			carFactory = new CarFactory();
		} else if (factoryType == "truck") {
			truckMotor = new TruckMotor();
		} else {
			throw new VehicleTypeNotFoundException();
		}
		return vehicleFactory;
	}
}
