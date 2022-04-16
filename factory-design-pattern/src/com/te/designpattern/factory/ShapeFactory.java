package com.te.designpattern.factory;

public class ShapeFactory {
	public Shape showShape(String str) {
		if (str.equalsIgnoreCase("circle"))
			return new Circle();
		else if (str.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		else if (str.equalsIgnoreCase("square"))
			return new Square();
		else
			return null;
	}
}
