package amrib.designPattern.abstractFactory.car;

public class HyundaiCarFactory implements CarFactory {

	@Override
	public Car createCar(String carType) {
		// TODO Auto-generated method stub
		if ("i10".equalsIgnoreCase(carType)) {
			return new I10();
		} else if ("i20".equalsIgnoreCase(carType)) {
			return new I20();
		}
		return null;
	}

}
