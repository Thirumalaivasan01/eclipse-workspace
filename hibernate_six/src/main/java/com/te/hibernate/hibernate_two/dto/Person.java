package com.te.hibernate.hibernate_two.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "person")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personId;

	private String personName;

	@OneToOne(cascade = CascadeType.ALL)
	private SmartPhone smartPhone;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Pet> petList;

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}

}
