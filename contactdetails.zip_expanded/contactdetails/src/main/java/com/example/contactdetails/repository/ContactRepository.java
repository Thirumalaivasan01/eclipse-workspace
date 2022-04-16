package com.example.contactdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.contactdetails.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
