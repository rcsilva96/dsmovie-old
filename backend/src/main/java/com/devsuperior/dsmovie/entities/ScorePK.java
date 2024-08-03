package com.devsuperior.dsmovie.entities;

import java.io.Serializable;

<<<<<<< HEAD
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
=======
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
>>>>>>> 29d6537 (Domain model, database seed)

@Embeddable

public class ScorePK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	
	
	public ScorePK() {}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
