package amrib.designPattern.abstractFactory.car;

public class HondaCarFactory implements CarFactory {

	@Override
	public Car createCar(String carType) {
		// TODO Auto-generated method stub
		if ("brio".equalsIgnoreCase(carType)) {
			return new Brio();
		} else if ("city".equalsIgnoreCase(carType)) {
			return new City();
		}
		return null;
	}

}
