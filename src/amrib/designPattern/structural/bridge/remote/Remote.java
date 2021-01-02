package amrib.designPattern.structural.bridge.remote;

public abstract class Remote {
	
	protected Devise devise;
	
	public Remote(Devise devise) {
		this.devise = devise;
	}

	public abstract void tooglePower();

	public abstract void volumeDown();

	public abstract void volumeUp();

	public abstract void channelDown();

	public abstract void channelUp();

}
