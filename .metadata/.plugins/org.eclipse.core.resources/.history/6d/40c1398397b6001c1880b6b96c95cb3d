package com.te.assignment.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movie_cast_table")
public class MovieCast {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int movieCastId;
	@Column(name = "role")
	private String role;

	//@JoinColumn(name = "actor_fk")
	@OneToOne(cascade=CascadeType.ALL)
	private Actor actor;

	@ManyToOne //(cascade = CascadeType.ALL)
	@JoinColumn(name = "movie_fk")
	private Movie movie;

	
}
