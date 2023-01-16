package com.api.movie.controller;

import com.api.movie.model.Movie;
import com.api.movie.model.dto.MovieDtoList;
import com.api.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/findAll")
public class MovieController {

    @Autowired
    private MovieService service;

    @GetMapping("/")
    public ResponseEntity<MovieDtoList> findAll(){
        List<Movie> movieList = service.findAll();
        MovieDtoList result = new MovieDtoList(movieList);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
