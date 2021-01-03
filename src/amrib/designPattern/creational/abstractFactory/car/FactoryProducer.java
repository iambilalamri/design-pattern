package amrib.designPattern.creational.abstractFactory.car;

public class FactoryProducer {

	public static CarFactory getCarFactory(String factoryType) {
		if ("hyundai".equalsIgnoreCase(factoryType)) {
			return new HyundaiCarFactory();
		} else if ("honda".equalsIgnoreCase(factoryType)) {
			return new HondaCarFactory();
		}
		return null;
	}

}
