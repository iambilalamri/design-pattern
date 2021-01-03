package amrib.designPattern.creational.abstractFactory.furniture;

public class ModernChair implements Chair {

	int pallets = 3;

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("Make Modern Chair with " + this.pallets + " pallets");
	}

}
