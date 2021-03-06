package com.te.hibernate.hibernate_two.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "pet")
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int petId;
	private String petName;
	
	@ManyToMany(mappedBy = "petList")
	private List<Person> personList;

	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", petName=" + petName + "]";
	}

}
