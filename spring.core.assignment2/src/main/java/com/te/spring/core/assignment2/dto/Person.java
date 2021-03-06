package com.te.spring.core.assignment2.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	private int personId;
	private String personName;
	@Autowired
	@Qualifier("idli")
	private Food foods;
	@Autowired
	@Qualifier("milk")
	private Drinks drinks;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Person(int personId, String personName, Food foods, Drinks drinks) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.foods = foods;
		this.drinks = drinks;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", foods=" + foods + ", drinks=" + drinks
				+ "]";
	}

	public Food getFoods() {
		return foods;
	}

	public void setFoods(Food foods) {
		this.foods = foods;
	}

	public Drinks getDrinks() {
		return drinks;
	}

	public void setDrinks(Drinks drinks) {
		this.drinks = drinks;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}
