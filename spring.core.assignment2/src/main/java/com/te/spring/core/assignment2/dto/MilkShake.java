package com.te.spring.core.assignment2.dto;

public class MilkShake implements Drinks {
	private String milkShake = "MilkShake";

	@Override
	public String drinkName() {
		// TODO Auto-generated method stub
		return milkShake;
	}

	@Override
	public String toString() {
		return "MilkShake [milkShake=" + milkShake + "]";
	}

}
