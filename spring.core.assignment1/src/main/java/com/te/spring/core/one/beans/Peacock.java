package com.te.spring.core.one.beans;

public class Peacock implements Creature {
	String name;
	String type;

	@Override
	public String creatureName() {
		name = "Peacock";
		return name;
	}

	@Override
	public String creatureType() {
		type = "bird";
		return type;
	}

	@Override
	public String toString() {
		return "Peacock [name=" + name + ", type=" + type + "]";
	}

}
