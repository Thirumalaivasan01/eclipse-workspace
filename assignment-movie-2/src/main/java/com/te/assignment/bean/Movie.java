package com.te.assignment.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private int movieId;
	private String movieTitle;
	private int movieYear;
	private String movieLanguage;

	@ManyToOne
	private Director director;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "movie")
	private List<MovieCast> castList;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "movie")
	private MovieRating movieRating;

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieTitle=" + movieTitle + ", movieYear=" + movieYear
				+ ", movieLanguage=" + movieLanguage + ", director=" + director + "]";
	}
}
