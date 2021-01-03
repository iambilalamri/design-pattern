package amrib.designPattern.creational.prototype;

public class Person implements Prototype {

	private String firstname;
	private String lastname;
	private String email;

	public Person() {
		this.firstname = "Amir";
		this.lastname = "MONSIF";
		this.email = "amir.monsif@gmail.com";
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public Prototype getClone() {
		// TODO Auto-generated method stub
		return new Person();
	}

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
	}
	
	

}
