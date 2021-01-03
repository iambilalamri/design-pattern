package amrib.designPattern.creational.abstractFactory.shoes;

public class ClassicShoesFactory extends ShoesFactory {

	@Override
	OuterSole getOuterSole() {
		// TODO Auto-generated method stub
		return new ClassicShoesOuterSole();
	}

	@Override
	Side getSide() {
		// TODO Auto-generated method stub
		return new ClassicShoesSide();
	}

}
