package com.te.spring.core.assignment3.dto;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Child {
	private String name;
	private int age;
	private String gender;
	private int standard;
	private List<String> hobbies;
	private Set<String> subjectStudying;
	private Map<String, String> friendsAndGender;
	@Autowired
	@Qualifier("cat")
	private Pet pet;

	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Child(String name, int age, String gender, int standard, List<String> hobbies, Set<String> subjectStudying,
			Map<String, String> friendsAndGender, Pet pet) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.standard = standard;
		this.hobbies = hobbies;
		this.subjectStudying = subjectStudying;
		this.friendsAndGender = friendsAndGender;
		this.pet = pet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public Set<String> getSubjectStudying() {
		return subjectStudying;
	}

	public void setSubjectStudying(Set<String> subjectStudying) {
		this.subjectStudying = subjectStudying;
	}

	public Map<String, String> getFriendsAndGender() {
		return friendsAndGender;
	}

	public void setFriendsAndGender(Map<String, String> friendsAndGender) {
		this.friendsAndGender = friendsAndGender;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	@Override
	public String toString() {
		return "Child [name=" + name + ", age=" + age + ", gender=" + gender + ", standard=" + standard + ", hobbies="
				+ hobbies + ", subjectStudying=" + subjectStudying + ", friendsAndGender=" + friendsAndGender + ", pet="
				+ pet + "]";
	}

}
