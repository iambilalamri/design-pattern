package amrib.designPattern.creational.factory.logistic;

public class LogisticFactory {

	public Logistics getLogistic(String logisticType) {
		if (logisticType == null) {
			return null;
		}
		if (logisticType.equalsIgnoreCase("SEA")) {
			return new SeaLogistic();
		} else if (logisticType.equalsIgnoreCase("ROAD")) {
			return new RoadLogistic();
		} else if (logisticType.equalsIgnoreCase("AIR")) {
			return new AirLogistic();
		}

		return null;
	}
}
