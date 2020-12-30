package amrib.designPattern.abstractFactory.vehicle;

public class TruckFactory extends VehicleFactory {

	@Override
	public Motor getMotor() {
		// TODO Auto-generated method stub
		return new TruckMotor();
	}

	@Override
	public Pneu getPneu() {
		// TODO Auto-generated method stub
		return new TruckPneu();
	}

}
