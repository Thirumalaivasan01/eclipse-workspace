package com.te.spring.core.assignment2.dto;

public class Idli implements Food {
	private String idli = "Idli";

	@Override
	public String toString() {
		return "Idli [idli=" + idli + "]";
	}

	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return idli;
	}

}
