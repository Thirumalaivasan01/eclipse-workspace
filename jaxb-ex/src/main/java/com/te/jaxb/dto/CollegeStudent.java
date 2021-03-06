package com.te.jaxb.dto;

import java.util.Map;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class CollegeStudent {
	private int sId;
	private String sName;
	private int sAge;
	private Map<String, Integer> sMarks;
	private Address address;

	public CollegeStudent(int sId, String sName, int sAge, Map<String, Integer> sMarks) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
		this.sMarks = sMarks;
	}

	public CollegeStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	@XmlElement(name = "s_id")
	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	@XmlElement(name = "s_name")
	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	@XmlTransient
	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
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
		return "CollegeStudent [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + ", sMarks=" + sMarks
				+ ", address=" + address + "]";
	}

}
