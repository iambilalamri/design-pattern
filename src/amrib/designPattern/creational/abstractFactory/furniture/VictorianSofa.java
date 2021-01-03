package amrib.designPattern.creational.abstractFactory.furniture;

public class VictorianSofa implements Sofa {

	int pilliers = 4;

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("Make Victorian Sofa with " + this.pilliers + " pilliers");
	}

}
