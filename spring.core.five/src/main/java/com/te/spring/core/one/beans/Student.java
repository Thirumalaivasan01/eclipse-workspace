package com.te.spring.core.one.beans;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Student implements Serializable {
	private int studentId;
	private String studentName;
	private int studentAge;
	private List<String> friendsList;
	private Set<Integer> numbersSet;

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", friendsList=" + friendsList + ", numbersList=" + numbersSet + "]";
	}

	public void sayhi() {
		System.out.println("Hi");
	}

	public void saybye() {
		System.out.println("Bye");
	}

	public int getStudentId() {
		return studentId;
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
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public List<String> getFriendsList() {
		return friendsList;
	}

	public void setFriendsList(List<String> friendsList) {
		this.friendsList = friendsList;
	}

	public Set<Integer> getNumbersSet() {
		return numbersSet;
	}

	public void setNumbersSet(Set<Integer> numbersList) {
		this.numbersSet = numbersList;
	}
}
