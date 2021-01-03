package amrib.designPattern.creational.abstractFactory.shoes;

import amrib.designPattern.creational.factory.shoes.ShoesTypeNotFoundException;

public abstract class ShoesFactory {

	static ClassicShoesFactory classicShoesFactory = null;
	static SportShoesFactory sportShoesFactory = null;

	abstract OuterSole getOuterSole();

	abstract Side getSide();

	public static ShoesFactory getFactory(String factoryType) throws ShoesTypeNotFoundException {
		ShoesFactory shoesFactory = null;

		if (factoryType == null)
			return null;

		switch (factoryType) {
		case "sport":
			if (sportShoesFactory == null)
				return new SportShoesFactory();
			shoesFactory = sportShoesFactory;
			break;
		case "classic":
			if (classicShoesFactory == null)
				return new ClassicShoesFactory();
			shoesFactory = classicShoesFactory;
			break;
		default:
			throw new ShoesTypeNotFoundException();
		}
		return shoesFactory;
	}

}
