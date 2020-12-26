package amrib.designPattern.factory.logistic;

public class LogisticPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogisticFactory logisticFactory = new LogisticFactory();

		Logistics sea = logisticFactory.getLogistic("SEA");
		sea.createTransport();

		Logistics road = logisticFactory.getLogistic("ROAD");
		road.createTransport();

		Logistics air = logisticFactory.getLogistic("AIR");
		air.createTransport();
	}

}
