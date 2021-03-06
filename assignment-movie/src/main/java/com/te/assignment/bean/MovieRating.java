package com.te.assignment.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movie_rating_table")
public class MovieRating {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ratingId;
	@Column(name = "review_stars")
	private int reviewStars;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "movie_id")
	private Movie movie;

}
