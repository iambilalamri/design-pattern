package amrib.designPattern.creational.abstractFactory.furniture;

public class FactoryProducer {

	public static FurnitureFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase(FurnitureType.MODERN.name())) {
			return new ModernFurnitureFactory();
		} else if (choice.equalsIgnoreCase(FurnitureType.VICTORIAN.name())) {
			return new VictorianFurnitureFactory();
		}
		return null;
	}
}
