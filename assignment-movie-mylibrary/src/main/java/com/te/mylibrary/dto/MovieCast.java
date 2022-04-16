package com.te.mylibrary.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int mcId;
	private String role;
	
	@Autowired
	@OneToOne
	private Actor actor;
	
	@Autowired
	@ManyToOne
	private Movie movie;

	@Override
	public String toString() {
		return "MovieCast [mcId=" + mcId + ", role=" + role + ", actor=" + actor + ", movie=" + movie + "]";
	}
}
