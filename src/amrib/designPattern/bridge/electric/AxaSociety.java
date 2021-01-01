package amrib.designPattern.bridge.electric;

public class AxaSociety extends Society {

	public AxaSociety(EnergieProvider provider) {
		super(provider);
		// TODO Auto-generated constructor stub
	}

	@Override
	void engagedWith() {
		// TODO Auto-generated method stub
		System.out.print("Axa society is engaged with ");
		provider.engagedWith();
	}

}
