package amrib.designPattern.structural.bridge.electric;

public abstract class Society {

	protected EnergieProvider provider;
	
	public Society(EnergieProvider provider) {
		this.provider = provider;
	}
	
	abstract void engagedWith();
	
}
