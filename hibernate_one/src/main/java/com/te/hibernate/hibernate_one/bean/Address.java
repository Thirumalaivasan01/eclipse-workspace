package com.te.hibernate.hibernate_one.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "a_id")
	private int aId;

	@Column(name = "a_line01")
	private String aLine01;

	@Column(name = "a_line01")
	private String aLine02;

	@OneToOne
	@JoinColumn(name = "s_fk")
	private Student student;
}
