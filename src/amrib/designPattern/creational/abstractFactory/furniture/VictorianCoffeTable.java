package amrib.designPattern.creational.abstractFactory.furniture;

public class VictorianCoffeTable implements CoffeTable {

	int legs = 4;

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("Make Victorian Coffe table with " + this.legs + " legs");
	}

}
