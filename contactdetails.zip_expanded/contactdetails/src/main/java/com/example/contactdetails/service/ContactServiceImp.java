package com.example.contactdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.contactdetails.entity.Contact;
import com.example.contactdetails.entity.Phone_no;
import com.example.contactdetails.repository.ContactRepository;
import com.example.contactdetails.repository.PhoneNumber;

@Service
public class ContactServiceImp implements ContactService{
	@Autowired
	private ContactRepository contactrepo;
	@Autowired
	private PhoneNumber phonerepo;

	@Override
	public List<Contact> getContacts() {
		// TODO Auto-generated method stub
		return contactrepo.findAll();
	}

	@Override
	public Contact getContact(int id) {
		// TODO Auto-generated method stub
		return contactrepo.findById(id).get();
	}

	@Override
	public Contact addContact(Contact contact) {
		return contactrepo.save(contact);
		
	}


	@Override
	public String deleteContact(int id) {
		contactrepo.deleteById(id);
		return "contact with id= "+id+" is deleted...";
	}

	@Override
	public Contact updateContact(Contact contact) {
		
		return contactrepo.save(contact);
	}

	

}
