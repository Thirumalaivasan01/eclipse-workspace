package com.te.spring.core.one.beans;

public class Lion implements Creature {
	String name;
	String type;
	@Override
	public String toString() {
		return "Lion [name=" + name + ", type=" + type + "]";
	}

	@Override
	public String creatureName() {
		name="Lion";
		return name;
	}

	@Override
	public String creatureType() {
		type="animal";
		return type;
	}

}
