package amrib.designPattern.creational.abstractFactory.car;

public class CarAbstractFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory hondaCarFactory = FactoryProducer.getCarFactory("honda");
		Car brio = hondaCarFactory.createCar("brio");
		brio.drive();

		Car city = hondaCarFactory.createCar("city");
		city.drive();

		System.out.println("**********************");

		CarFactory hyundaiCarFactory = FactoryProducer.getCarFactory("hyundai");
		Car i10 = hyundaiCarFactory.createCar("i10");
		i10.drive();

		Car i20 = hyundaiCarFactory.createCar("i20");
		i20.drive();
	}

}
