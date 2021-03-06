package com.te.spring.core.one.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Student implements Serializable {
	@Value("1")
	private int studentId;
	@Value("Name01")
	private String studentName;
	@Value("78")
	private int studentAge;
	
	private Address address;

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", address=" + address + "]";
	}

	public int getStudentId() {
		return studentId;
	}

	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public Student() {
		super();
		System.out.println("Student default Constructor");
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	
	public Student(Address address) {
		super();
		this.address = address;
		System.out.println("Student(Address address) is called!");
	}
}
