package com.example.contactdetails.service;

import java.util.List;

import com.example.contactdetails.entity.Contact;
import com.example.contactdetails.entity.Phone_no;

public interface ContactService {
	public List<Contact> getContacts();
	public Contact getContact(int id);
	public Contact addContact(Contact contact);
	public Contact updateContact(Contact concat);
	public String deleteContact(int parseInt);


}
