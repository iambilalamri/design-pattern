package amrib.designPattern.behavioral.observer;

public class Main {

	public static void main(String[] args) {
		Product iphone = new Product("IPhone ");

		Person kamal = new Person("Kamal");
		Person farid = new Person("Farid");
		Person salim = new Person("Salim");

		iphone.add(salim);
		iphone.add(farid);
		iphone.add(kamal);
		
		iphone.setAvailability(true);
		
	}

}
