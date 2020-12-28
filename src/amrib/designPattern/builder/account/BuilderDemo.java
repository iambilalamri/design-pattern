package amrib.designPattern.builder.account;

import java.util.Arrays;

public class BuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Name name = new Name.Builder().firstName("Bilal").middleName(Arrays.asList("Hilal")).surname("AMRI").build();

		Address address = new Address.Builder().houseNumber(30).street("Rue Bizet").zipCode("58444").city("Montpelier")
				.build();

		Account account = new Account.Builder().id(1).email("hilal.ame@gmail.com").name(name).address(address).build();

	}

}
