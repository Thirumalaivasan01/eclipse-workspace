package com.te.hibernate.hibernate_two.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movie")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "movie_id")
	private int movieId;
	
	@Column(name = "movie_name")
	private String movieName;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "m_a_mapping", joinColumns = @JoinColumn(name = "movie_fk"), inverseJoinColumns = @JoinColumn(name = "actor_fk"))

	private List<Actor> actors;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="director_fk")
	private Director director;

}
