package com.te.jackson.beans;

import java.util.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({ "sAge", "sMarks" })
@JsonInclude(value = Include.NON_NULL)
public class Student {
	@JsonProperty(value = "s_id")
	private int sId;

	@JsonProperty(value = "s_name")
	private String sName;

	// @JsonProperty(value = "s_age")
	private int sAge;

	@JsonProperty(value = "s_father_name")
	private String sFatherName;

	@JsonProperty(value = "s_mother_name")
	private String sMotherName;

	@JsonProperty(value = "s_phone_number")
	private long sPhoneNumber;

	@JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy")
	@JsonProperty(value = "s_dob")
	private Date sDOB;

	// @JsonIgnore
	// @JsonProperty(value = "s_marks")
	private Map<String, Integer> sMarks;

	@JsonProperty(value = "s_address")
	private Address address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sId, String sName, int sAge, String sFatherName, String sMotherName, long sPhoneNumber,
			Date sDOB, Map<String, Integer> sMarks, Address address) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
		this.sFatherName = sFatherName;
		this.sMotherName = sMotherName;
		this.sPhoneNumber = sPhoneNumber;
		this.sDOB = sDOB;
		this.sMarks = sMarks;
		this.address = address;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public String getsFatherName() {
		return sFatherName;
	}

	public void setsFatherName(String sFatherName) {
		this.sFatherName = sFatherName;
	}

	public String getsMotherName() {
		return sMotherName;
	}

	public void setsMotherName(String sMotherName) {
		this.sMotherName = sMotherName;
	}

	public long getsPhoneNumber() {
		return sPhoneNumber;
	}

	public void setsPhoneNumber(long sPhoneNumber) {
		this.sPhoneNumber = sPhoneNumber;
	}

	public Date getsDOB() {
		return sDOB;
	}

	public void setsDOB(Date sDOB) {
		this.sDOB = sDOB;
	}

	public Map<String, Integer> getsMarks() {
		return sMarks;
	}

	public void setsMarks(Map<String, Integer> sMarks) {
		this.sMarks = sMarks;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + ", sFatherName=" + sFatherName
				+ ", sMotherName=" + sMotherName + ", sPhoneNumber=" + sPhoneNumber + ", sDOB=" + sDOB + ", sMarks="
				+ sMarks + ", address=" + address + "]";
	}

}
