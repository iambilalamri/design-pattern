package amrib.designPattern.abstractFactory.shoes;

public class ShoesFactory {

	public static Shoes getFactory(ShoesType shoesType) throws ShoesTypeNotFoundException {
		if (shoesType == null) {
			return null;
		} else if (shoesType == ShoesType.BOAT) {
			return new BoatShoes();
		} else if (shoesType == ShoesType.HIGH_HEELS) {
			return new HighHeels();
		} else if (shoesType == ShoesType.SPORT) {
			return new SportShoes();
		} else {
			throw new ShoesTypeNotFoundException();
		}
	}

}
