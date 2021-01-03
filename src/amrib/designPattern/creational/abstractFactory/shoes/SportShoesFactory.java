package amrib.designPattern.creational.abstractFactory.shoes;

public class SportShoesFactory extends ShoesFactory {

	@Override
	OuterSole getOuterSole() {
		// TODO Auto-generated method stub
		return new SportShoesOuterSole();
	}

	@Override
	Side getSide() {
		// TODO Auto-generated method stub
		return new SportShoesSide();
	}

}
