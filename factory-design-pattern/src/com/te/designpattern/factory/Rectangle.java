package com.te.designpattern.factory;

public class Rectangle implements Shape {
	@Override
	public void createObject() {
		System.out.println("This is Rectangle Object");
	}
}
