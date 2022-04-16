package com.te.assignment.bean;

import javax.persistence.CascadeType;
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
@Table(name = "actor_table")
public class Actor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int actorId;

	private String actorName;
	private String actorGender;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "actor")
	private MovieCast cast;
	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", actorName=" + actorName + ", actorGender=" + actorGender + "]";
	}
}
