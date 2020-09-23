package net.rameez.contact.model;

public class Contact {
	private Integer id;
	private String name;
	private String email;
	private String phone;
	private String domain;
	private String notes;
	
	public Contact() {
		
	}

	public Contact(Integer id, String name, String email, String phone, String domain, String notes) {
		this(name, email, phone, domain, notes);
		this.id = id;
	}
	
	public Contact(String name, String email, String phone, String domain, String notes) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.domain = domain;
		this.notes = notes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", domain=" + domain
				+ ", notes=" + notes + "]";
	}
	
	

}
