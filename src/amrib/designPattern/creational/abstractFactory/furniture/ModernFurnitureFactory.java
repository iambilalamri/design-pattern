package amrib.designPattern.creational.abstractFactory.furniture;

public class ModernFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		// TODO Auto-generated method stub
		return new ModernChair();
	}

	@Override
	public CoffeTable createCoffeTable() {
		// TODO Auto-generated method stub
		return new ModernCoffeTable();
	}

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new ModernSofa();
	}

}
