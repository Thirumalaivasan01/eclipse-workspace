package com.te.spring.core.assignment3.dto;

public class Cat implements Pet {
	String type = "Cat";
	String name="catName";

	@Override
	public String toString() {
		return "Cat [type=" + type + ", name=" + name + "]";
	}

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

}
