package com.te.hibernate.hibernate_two.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "smartphone")
public class SmartPhone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int smartId;
	private String smartName;

	@OneToMany(mappedBy = "smartPhone",cascade = CascadeType.ALL)
	private List<Call> callList;

	@OneToOne(mappedBy="smartPhone",cascade=CascadeType.ALL)
	private Person person;

	@Override
	public String toString() {
		return "SmartPhone [smartId=" + smartId + ", smartName=" + smartName + "]";
	}
}
