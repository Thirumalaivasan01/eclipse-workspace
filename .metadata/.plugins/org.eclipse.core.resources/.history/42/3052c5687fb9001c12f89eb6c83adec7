package com.te.assignment.bean;

import java.util.List;

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
@Table(name = "movie_rating_table")
public class MovieRating {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mrId;

	@OneToOne
	private Movie movie;

	private int reviewStars;

	@Override
	public String toString() {
		return "MovieRating [mrId=" + mrId + ", movie=" + movie + ", reviewStars=" + reviewStars + "]";
	}
}
