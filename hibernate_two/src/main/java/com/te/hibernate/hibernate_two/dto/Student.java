package com.te.hibernate.hibernate_two.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "s_id")
	private int sId;

	@Column(name = "s_name")
	private String sName;

	@Column(name = "s_age")
	private int sAge;

	@OneToOne(mappedBy = "student")
	private Address address;
}
