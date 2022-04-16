package com.example.contactdetails.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Contact {

	@Id
	@Column(name="contact_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int contactId;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="contact_id")
	private List<Name> name;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="contact_id")
	private List<Email> email;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="contact_id")
	private List<Address> address;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="contact_id")
	private List<Phone_no> phone_no;

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public List<Name> getName() {
		return name;
	}

	public void setName(List<Name> name) {
		this.name = name;
	}

	public List<Email> getEmail() {
		return email;
	}

	public void setEmail(List<Email> email) {
		this.email = email;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<Phone_no> getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(List<Phone_no> phone_no) {
		this.phone_no = phone_no;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", phone_no=" + phone_no + "]";
	}

	public Contact(int contactId, List<Name> name, List<Email> email, List<Address> address, List<Phone_no> phone_no) {
		super();
		this.contactId = contactId;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone_no = phone_no;
	}
	
	
	
	
}
