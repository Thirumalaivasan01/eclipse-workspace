package com.te.spring.core.assignment3.dto;

public class Dog implements Pet {
	String type="Dog";
	String name="dogName";
	@Override
	public String petType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public String petName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String toString() {
		return "Dog [type=" + type + ", name=" + name + "]";
	}

}
