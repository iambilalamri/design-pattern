package amrib.designPattern.abstractFactory.furniture;

public class VictorianFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		// TODO Auto-generated method stub
		return new VictorianChair();
	}

	@Override
	public CoffeTable createCoffeTable() {
		// TODO Auto-generated method stub
		return new VictorianCoffeTable();
	}

	@Override
	public Sofa createSofa() {
		// TODO Auto-generated method stub
		return new VictorianSofa();
	}

}
