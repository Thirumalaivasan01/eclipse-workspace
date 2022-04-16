package com.te.jaxb.dto;

public class Address {
	private int aId;
	private String aLine01;
	private String aLine02;

	public Address(int aId, String aLine01, String aLine02) {
		super();
		this.aId = aId;
		this.aLine01 = aLine01;
		this.aLine02 = aLine02;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [aId=" + aId + ", aLine01=" + aLine01 + ", aLine02=" + aLine02 + "]";
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getaLine01() {
		return aLine01;
	}

	public void setaLine01(String aLine01) {
		this.aLine01 = aLine01;
	}

	public String getaLine02() {
		return aLine02;
	}

	public void setaLine02(String aLine02) {
		this.aLine02 = aLine02;
	}
}
