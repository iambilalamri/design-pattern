package amrib.designPattern.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person(); // Couplage Fort
		System.out.println(person1);

		Prototype person2 = person1.getClone(); // Couplage Faible
		System.out.println(person2);

		Person person3 = (Person) person1.getClone(); // Couplage Faible using Cast
		System.out.println(person3);

	}

}
