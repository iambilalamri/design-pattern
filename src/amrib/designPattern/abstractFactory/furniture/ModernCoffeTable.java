package amrib.designPattern.abstractFactory.furniture;

public class ModernCoffeTable implements CoffeTable {

	int legs = 4;

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("Make Modern Coffe table with " + this.legs + " legs");
	}

}
