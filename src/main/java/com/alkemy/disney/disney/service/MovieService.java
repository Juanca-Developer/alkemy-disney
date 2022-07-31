package com.alkemy.disney.disney.service;


import com.alkemy.disney.disney.dto.MovieDto;


import java.util.List;

public interface MovieService {

    MovieDto save (MovieDto dto);

    List<MovieDto> getAllMovies();

}
