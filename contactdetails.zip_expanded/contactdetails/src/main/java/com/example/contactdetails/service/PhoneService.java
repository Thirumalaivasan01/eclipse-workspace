package com.example.contactdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.contactdetails.entity.Phone_no;
import com.example.contactdetails.repository.PhoneNumber;

@Service
public class PhoneService {

	@Autowired
private	PhoneNumber phonerepo;
	
	public List<Phone_no> getPhoneno(){
		return phonerepo.findAll();
	}
	
}
