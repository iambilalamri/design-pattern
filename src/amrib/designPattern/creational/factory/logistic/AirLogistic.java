package amrib.designPattern.creational.factory.logistic;

public class AirLogistic implements Logistics {

	private Long id;
	private String stationName;
	private Double surface;

	@Override
	public void createTransport() {
		// TODO Auto-generated method stub
		System.out.println("I am using Tansport [AIR_LOGISTIC]");
	}

}
