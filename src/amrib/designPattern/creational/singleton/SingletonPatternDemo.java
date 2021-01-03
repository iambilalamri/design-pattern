package amrib.designPattern.creational.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EagerSingleton eager1 = EagerSingleton.getInstance();
		LazySingleton eager2 = LazySingleton.getInstance();
		
		System.out.println(eager1.hashCode());
		System.out.println(eager2.hashCode());
		
		eager1.print();
		eager2.print();
	}

}
