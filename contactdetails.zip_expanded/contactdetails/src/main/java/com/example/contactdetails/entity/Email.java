package com.example.contactdetails.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="email")
public class Email {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int e_id;

private String email_id;
@Column(name="contact_id")
private int contactId;
public int getE_id() {
	return e_id;
}
public void setE_id(int e_id) {
	this.e_id = e_id;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
public int getContactId() {
	return contactId;
}
public void setContactId(int contactId) {
	this.contactId = contactId;
}
public Email() {
	super();
	// TODO Auto-generated constructor stub
}
public Email(int e_id, String email_id, int contactId) {
	super();
	this.e_id = e_id;
	this.email_id = email_id;
	this.contactId = contactId;
}
@Override
public String toString() {
	return "Email [e_id=" + e_id + ", email_id=" + email_id + ", contactId=" + contactId + "]";
}


}
