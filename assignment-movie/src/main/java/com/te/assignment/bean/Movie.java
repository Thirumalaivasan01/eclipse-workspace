package com.te.assignment.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movie_table")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "movie_id")
	private int movieId;

	@Column(name = "movie_title")
	private String movieTitle;

	@Column(name = "movie_year")
	private int movie_year;

	@Column(name = "movie_language")
	private String movieLanguage;

	// @Column(name = "director_id")
	@ManyToOne(cascade = CascadeType.ALL)
	private Director director;

	@OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
	private List<MovieCast> movieList;

	@OneToOne(mappedBy = "movie", cascade = CascadeType.ALL)
	private MovieRating movieRatingId;

}
