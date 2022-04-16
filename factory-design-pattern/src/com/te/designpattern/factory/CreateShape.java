package com.te.designpattern.factory;

public class CreateShape {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		(factory.showShape("square")).createObject();
	}

}
