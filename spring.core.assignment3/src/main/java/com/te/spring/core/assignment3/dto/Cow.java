package com.te.spring.core.assignment3.dto;

public class Cow implements Pet{
	String name="CowName";
	String type="Cow";
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
		return "Cow [name=" + name + ", type=" + type + "]";
	}
	
	
}
