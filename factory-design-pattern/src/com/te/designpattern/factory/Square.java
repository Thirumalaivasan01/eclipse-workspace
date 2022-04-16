package com.te.designpattern.factory;

public class Square implements Shape {

	@Override
	public void createObject() {
		System.out.println("This is Square Object");
	}

}
