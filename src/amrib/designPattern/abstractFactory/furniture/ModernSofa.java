package amrib.designPattern.abstractFactory.furniture;

public class ModernSofa implements Sofa {

	int pilliers = 4;

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("Make Modern Sofa with " + this.pilliers + " pilliers");
	}

}
