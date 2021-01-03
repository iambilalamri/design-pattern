package amrib.designPattern.structural.adapter;

import java.util.Date;

public class StudentEntity {

	private String id;
	private String firstname;
	private String lastname;
	private Date lastModification;
	private boolean isSubscribed;

	public StudentEntity(String firstname, String lastname, Date lastModification, boolean isSubscribed) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.lastModification = lastModification;
		this.isSubscribed = isSubscribed;
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

	public Date getLastModification() {
		return lastModification;
	}

	public void setLastModification(Date lastModification) {
		this.lastModification = lastModification;
	}

	public boolean isSubscribed() {
		return isSubscribed;
	}

	public void setSubscribed(boolean isSubscribed) {
		this.isSubscribed = isSubscribed;
	}

}
