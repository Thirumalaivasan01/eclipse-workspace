package com.example.contactdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.contactdetails.entity.Phone_no;

@Repository
public interface PhoneNumber extends JpaRepository<Phone_no, Integer>{

}
