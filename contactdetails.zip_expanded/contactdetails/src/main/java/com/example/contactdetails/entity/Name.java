package com.example.contactdetails.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="name")
public class Name {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String firstname;
	private String middlename;
	private String lastname;
	@Column(name="contact_id")
	private int contactId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Name(int id, String firstname, String middlename, String lastname, int contactId) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.contactId = contactId;
	}
	@Override
	public String toString() {
		return "Name [id=" + id + ", firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname
				+ ", contactId=" + contactId + "]";
	}
	
	
	
}
