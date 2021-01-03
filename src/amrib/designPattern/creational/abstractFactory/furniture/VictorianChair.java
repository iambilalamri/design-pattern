package amrib.designPattern.creational.abstractFactory.furniture;

public class VictorianChair implements Chair {

	int pallets = 4;

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("Make Victorian Chair with " + this.pallets + " pallets");
	}

}
