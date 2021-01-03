package amrib.designPattern.creational.singleton;

public class EagerSingleton {

	private static EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return instance;
	}

	public void print() {
		System.out.println("Print from Eager Singleton");
	}
}
