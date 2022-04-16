package com.te.spring.core.assignment2.dto;

public class Biryani implements Food {
	private String biryani = "Biryani";

	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return biryani;
	}

	@Override
	public String toString() {
		return "Biryani [biryani=" + biryani + "]";
	}

}
