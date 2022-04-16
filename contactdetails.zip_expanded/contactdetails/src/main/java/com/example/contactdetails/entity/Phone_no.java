package com.example.contactdetails.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="phone_no")
public class Phone_no {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int ph_id;
	private String ph_num;
	private String type;
	@Column(name="contact_id")
	private int contactId;
	public int getPh_id() {
		return ph_id;
	}
	public void setPh_id(int ph_id) {
		this.ph_id = ph_id;
	}
	public String getPh_num() {
		return ph_num;
	}
	public void setPh_num(String ph_num) {
		this.ph_num = ph_num;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public Phone_no(int ph_id, String ph_num, String type, int contactId) {
		super();
		this.ph_id = ph_id;
		this.ph_num = ph_num;
		this.type = type;
		this.contactId = contactId;
	}
	public Phone_no() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Phone_no [ph_id=" + ph_id + ", ph_num=" + ph_num + ", type=" + type + ", contactId=" + contactId + "]";
	}
	
	
}
