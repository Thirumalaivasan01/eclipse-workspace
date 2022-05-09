package com.te.employeeAssessment.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class EmployeeLeave {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leaveId;
	private String leaveDate;
	private String leaveStatus;
	
	@ManyToOne
	private EmployeeInfo employee;

	@Override
	public String toString() {
		return "EmployeeLeave [leaveId=" + leaveId + ", leaveDate=" + leaveDate + ", leaveStatus=" + leaveStatus + "]";
	}
	
}
