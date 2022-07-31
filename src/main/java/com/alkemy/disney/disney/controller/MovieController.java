package com.alkemy.disney.disney.controller;

import com.alkemy.disney.disney.dto.MovieDto;
import com.alkemy.disney.disney.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("movies")
public class MovieController {

    @Autowired
    public MovieService movieService;


    @PostMapping
    public ResponseEntity<MovieDto> save(@RequestBody MovieDto movie){
       MovieDto movieSaved = movieService.save(movie);
        return ResponseEntity.status(HttpStatus.CREATED).body(movieSaved);
    }

    @GetMapping
    public ResponseEntity<List<MovieDto>> getAll() {
        List<MovieDto> movies =  movieService.getAllMovies();
        return ResponseEntity.ok().body(movies);
    }
}
