package amrib.designPattern.abstractFactory.vehicle;

public class CarMotor implements Motor {

	@Override
	public void design() {
		// TODO Auto-generated method stub
		System.out.println("Designing Motor of Car");
	}

	@Override
	public void manufacture() {
		// TODO Auto-generated method stub
		System.out.println("Manufacturing Motor of Car");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Testing Motor of Car");
	}

}
