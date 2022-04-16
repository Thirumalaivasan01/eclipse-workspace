package com.te.hibernate.hibernate_two.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student_table")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "s_id")
	private int sId;

	@Column(name = "s_name")
	private String sName;

	@Column(name = "s_age")
	private int sAge;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "c_s_mapping", joinColumns = @JoinColumn(name = "s_fk"), inverseJoinColumns = @JoinColumn(name = "c_fk"))

	private List<Course> courses;

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + "]";
	}
}
