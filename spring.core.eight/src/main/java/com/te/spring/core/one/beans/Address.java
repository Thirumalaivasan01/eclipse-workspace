package com.te.spring.core.one.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("1")
	private int aId;
	@Value("CC")
	private String city;
	@Value("SS")
	private String state;

	public Address(int aId, String city, String state) {
		super();
		this.aId = aId;
		this.city = city;
		this.state = state;
	}

	public Address() {
		super();
		System.out.println("Address default Constructor");
		// TODO Auto-generated constructor stub
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [aId=" + aId + ", city=" + city + ", state=" + state + "]";
	}

}
