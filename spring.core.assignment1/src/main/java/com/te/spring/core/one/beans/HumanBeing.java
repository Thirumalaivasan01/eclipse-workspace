package com.te.spring.core.one.beans;

public class HumanBeing implements Creature {
	String name;
	String type;

	@Override
	public String creatureName() {
		name = "Hari";
		return name;
	}

	@Override
	public String creatureType() {

		type = "human";
		return type;
	}

	@Override
	public String toString() {
		return "HumanBeing [name=" + name + ", type=" + type + "]";
	}

}
