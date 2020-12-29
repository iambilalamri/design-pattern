package amrib.designPattern.adapter;

public class StudentDTO {

	private String id;
	private String firstname;
	private String lastname;

	public StudentDTO(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "StudentDTO [firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}
