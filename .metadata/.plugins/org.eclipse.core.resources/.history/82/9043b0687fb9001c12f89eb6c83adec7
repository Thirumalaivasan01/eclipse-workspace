package com.te.assignment.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "director_table")
public class Director {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int directorId;
	private String directorName;
	private String directorPhone;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "director")
	private List<Movie> movieList;

	@Override
	public String toString() {
		return "Director [directorId=" + directorId + ", directorName=" + directorName + ", directorPhone="
				+ directorPhone + "]";
	}

}
