package com.te.hibernate.hibernate_one.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "person_table")
public class Person {
	@Id
	@Column(name = "person_id")
	private int personId;
	@Column(name = "person_name")
	private String personName;
	@Column(name = "person_age")
	private int personAge;

}
