package amrib.designPattern.abstractFactory.furniture;

public class DemoFurnitureFactory {

	private static FurnitureFactory configureApplication() {
		FurnitureFactory factory;
		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains(FurnitureType.MODERN.name())) {
			factory = new ModernFurnitureFactory();
		} else {
			factory = new VictorianFurnitureFactory();
		}
		return factory;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
