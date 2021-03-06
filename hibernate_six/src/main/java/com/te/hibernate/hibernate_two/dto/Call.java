package com.te.hibernate.hibernate_two.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "caller")
public class Call {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int callId;
	private String callName;

	@ManyToOne(cascade=CascadeType.ALL)
	private SmartPhone smartPhone;

	@Override
	public String toString() {
		return "Call [callId=" + callId + ", callName=" + callName + "]";
	}
}
