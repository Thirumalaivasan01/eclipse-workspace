package com.te.spring.core.one.beans;

public class GoldFish implements Creature {
	String name;
	String type ;

	@Override
	public String toString() {
		return "GoldFish [name=" + name + ", type=" + type + "]";
	}

	

	@Override
	public String creatureName() {
		name= "GoldFish";
		return name;
	}

	@Override
	public String creatureType() {
		type = "fish";
		return type;
	}
}
