package amrib.designPattern.abstractFactory.furniture;

public class DemoFurnitureFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FurnitureFactory modernFurniture = FactoryProducer.getFactory(FurnitureType.MODERN.name());
		Chair modernChair = modernFurniture.createChair();
		modernChair.make();
		CoffeTable modernCoffeTable = modernFurniture.createCoffeTable();
		modernCoffeTable.make();
		Sofa modernSofa = modernFurniture.createSofa();
		modernSofa.make();
		System.out.println("*********************************");
		FurnitureFactory victorianFurniture = FactoryProducer.getFactory(FurnitureType.VICTORIAN.name());
		Chair victorianChair = victorianFurniture.createChair();
		victorianChair.make();
		CoffeTable victorianCoffeTable = victorianFurniture.createCoffeTable();
		victorianCoffeTable.make();
		Sofa victorianSofa = victorianFurniture.createSofa();
		victorianSofa.make();
	}

}
