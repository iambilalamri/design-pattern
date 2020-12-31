package amrib.designPattern.abstractFactory.shoes;

import amrib.designPattern.factory.shoes.ShoesTypeNotFoundException;

public class ShoesAbstractFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ShoesFactory factory = ShoesFactory.getFactory("classic");
			OuterSole outerSole = factory.getOuterSole();
			outerSole.design();
			outerSole.manufacture();
			outerSole.testing();

			System.out.println("***************************");

			Side side = factory.getSide();
			side.conceive();
			side.design();
			side.manufacture();
			side.testing();

		} catch (ShoesTypeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
