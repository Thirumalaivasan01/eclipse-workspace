package com.example.contactdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.contactdetails.entity.Contact;
import com.example.contactdetails.entity.Phone_no;
import com.example.contactdetails.service.ContactService;
import com.example.contactdetails.service.PhoneService;

@RestController
public class ContactController {

	
	@Autowired
	private ContactService contactservice;
	@Autowired
	private PhoneService phoneservice;
	
	@GetMapping("/contacts")
	public List<Contact> getContact(){
		return contactservice.getContacts();
	}
	
	@GetMapping("/contacts/{id}")
	public Contact getContactbyId(@PathVariable String id) {
		return contactservice.getContact(Integer.parseInt(id));
	}
	@PostMapping("/contacts")
	public Contact addContact(@RequestBody Contact contact) {
		return contactservice.addContact(contact);
	}
	
	@PutMapping("/contacts")
	public Contact updateContact(@RequestBody Contact contact) {
		return contactservice.updateContact(contact);
	}
	
	@DeleteMapping("/contacts/{id}")
	public String deleteContact(@PathVariable String id) {
		return contactservice.deleteContact(Integer.parseInt(id));
	}
	
	
	@GetMapping("/contacts/phno")
	public List<Phone_no> getphoneno(){
		return phoneservice.getPhoneno();
	}
	
}
