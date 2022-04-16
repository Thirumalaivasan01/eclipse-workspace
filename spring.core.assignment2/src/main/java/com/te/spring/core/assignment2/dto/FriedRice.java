package com.te.spring.core.assignment2.dto;

public class FriedRice implements Food {
	private String friedRice = "FriedRice";

	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return friedRice;
	}

	@Override
	public String toString() {
		return "FriedRice [friedRice=" + friedRice + "]";
	}

}
