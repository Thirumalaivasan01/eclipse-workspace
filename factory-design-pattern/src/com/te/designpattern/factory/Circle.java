package com.te.designpattern.factory;

public class Circle implements Shape {
	@Override
	public void createObject() {
		System.out.println("This is Circle Object");
	}
}
