package com.learn.microservices.movieinfoservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.microservices.movieinfoservice.model.Movie;

@RestController
@RequestMapping(value="/movies")
public class MovieInfoServiceController {

	@RequestMapping(value="/{movieId}")
	public Movie getMovie(@PathVariable("movieId") String movieId) {
		return new Movie(movieId, "Test name");
	}
}
