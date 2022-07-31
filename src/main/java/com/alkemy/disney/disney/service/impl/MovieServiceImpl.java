package com.alkemy.disney.disney.service.impl;



import com.alkemy.disney.disney.dto.MovieDto;
import com.alkemy.disney.disney.entity.MovieEntity;
import com.alkemy.disney.disney.mapper.MovieMapper;
import com.alkemy.disney.disney.repository.MovieRepository;
import com.alkemy.disney.disney.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    public MovieMapper movieMapper;

    @Autowired
    public MovieRepository movieRepository;

    public MovieDto save(MovieDto dto){
        MovieEntity entity = movieMapper.movieDTO2Entity(dto);
        MovieEntity entitySaved = movieRepository.save(entity);
        MovieDto result = movieMapper.movieEntity2DTO(entitySaved);

        return result;
    }
    public List<MovieDto> getAllMovies() {
        List<MovieEntity> entities = movieRepository.findAll();
        List<MovieDto>result =  movieMapper.movieEntityList2DTOList(entities);
        return result;
    }
}
