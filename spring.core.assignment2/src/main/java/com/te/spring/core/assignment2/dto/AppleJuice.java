package com.te.spring.core.assignment2.dto;

public class AppleJuice implements Drinks {
	private String appleJuice = "AppleJuice";

	@Override
	public String drinkName() {
		// TODO Auto-generated method stub
		return appleJuice;
	}

	@Override
	public String toString() {
		return "AppleJuice [appleJuice=" + appleJuice + "]";
	}

}
