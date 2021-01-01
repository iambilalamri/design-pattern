package amrib.designPattern.bridge.electric;

public class SocietyEnergieProviderBridgeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Society tdeSogeti = new Sogeti(new TotalDirectEnergie());
		tdeSogeti.engagedWith();

		Society tseAxa = new AxaSociety(new TotalSE());
		tseAxa.engagedWith();
	}

}
