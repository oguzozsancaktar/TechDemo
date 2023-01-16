package com.api.movie.model.dto;

import com.api.movie.model.Movie;

import java.util.List;

public class MovieDtoList {

    private String type;

    private List<Movie> movieList;

    public MovieDtoList(List<Movie> movieList) {
        this.type = "Movie";
        this.movieList = movieList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }
}
