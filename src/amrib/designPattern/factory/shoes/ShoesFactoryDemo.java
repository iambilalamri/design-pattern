package amrib.designPattern.factory.shoes;

public class ShoesFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Shoes factory = ShoesFactory.getFactory(ShoesType.HIGH_HEELS);
			factory.make();
			factory.test();
			factory.sell();
		} catch (ShoesTypeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
