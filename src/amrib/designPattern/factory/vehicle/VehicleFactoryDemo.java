package amrib.designPattern.factory.vehicle;

public class VehicleFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleFactory factory = new VehicleFactory();
		try {
			Vehicle vehicle = factory.getFactory("");
			vehicle.design();
			vehicle.manufacture();
		} catch (VehicleTypeNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid vehicle type provided!");
			e.printStackTrace();
		}

	}

}
