package amrib.designPattern.creational.abstractFactory.vehicle;

public class CarFactory extends VehicleFactory {

	@Override
	public Motor getMotor() {
		// TODO Auto-generated method stub
		return new CarMotor();
	}

	@Override
	public Pneu getPneu() {
		// TODO Auto-generated method stub
		return new CarPneu();
	}

}
