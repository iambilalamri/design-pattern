package amrib.designPattern.creational.abstractFactory.furniture;

public class ModernCoffeTable implements CoffeTable {

	int legs = 3;

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("Make Modern Coffe table with " + this.legs + " legs");
	}

}
