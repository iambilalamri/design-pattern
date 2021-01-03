package amrib.designPattern.structural.bridge.electric;

public class Sogeti extends Society {

	public Sogeti(EnergieProvider provider) {
		super(provider);
		// TODO Auto-generated constructor stub
	}

	@Override
	void engagedWith() {
		// TODO Auto-generated method stub
		System.out.print("Sogeti society is engaged with ");
		provider.engagedWith();
	}

}
