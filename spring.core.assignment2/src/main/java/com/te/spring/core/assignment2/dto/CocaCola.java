package com.te.spring.core.assignment2.dto;

public class CocaCola implements Drinks {
	private String cocaCola = "CocaCola";

	@Override
	public String drinkName() {
		// TODO Auto-generated method stub
		return cocaCola;
	}

	@Override
	public String toString() {
		return "CocaCola [cocaCola=" + cocaCola + "]";
	}

}
