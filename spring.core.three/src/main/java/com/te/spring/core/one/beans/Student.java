package com.te.spring.core.one.beans;

import java.io.Serializable;

public class Student implements Serializable {
	private int studentId;
	private String studentName;
	private int studentAge;

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("setStudentId(int studentId) was called..");
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("setStudentName(String studentName) was called..");
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		System.out.println("setStudentAge(int studentAge) was called...");
		this.studentAge = studentAge;
	}

	public Student() {

		super();
		System.out.println("Student() constructor called...");
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		System.out.println("Student(int studentId, String studentName, int studentAge) constructor called...");
	}
}
