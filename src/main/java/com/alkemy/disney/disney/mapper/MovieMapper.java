package com.alkemy.disney.disney.mapper;



import com.alkemy.disney.disney.dto.MovieDto;
import com.alkemy.disney.disney.entity.MovieEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MovieMapper {

    public MovieEntity movieDTO2Entity(MovieDto dto){
        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setTitulo(dto.getTitulo());
        movieEntity.setImage(dto.getImage());
        movieEntity.setFechaCreacion(dto.getFechaCreacion());
        movieEntity.setCalificacion(dto.getCalificacion());
        movieEntity.setGenderId(dto.getGenderId());
        // movieEntity.setGender(dto.getGender());
        movieEntity.setPersonajes(dto.getPersonajes());

        return movieEntity;
    }
    public MovieDto movieEntity2DTO(MovieEntity entity){
        MovieDto dto = new MovieDto();
        dto.setTitulo(entity.getTitulo());
        dto.setId(entity.getId());
        dto.setImage(entity.getImage());
        dto.setFechaCreacion(entity.getFechaCreacion());
        dto.setCalificacion(entity.getCalificacion());
        dto.setGenderId(entity.getGenderId());
      // dto.setGender(entity.getGender());
        dto.setPersonajes(dto.getPersonajes());

        return dto;
    }
    public List<MovieDto> movieEntityList2DTOList(List<MovieEntity> entities){
        List<MovieDto> dtos = new ArrayList<>();
        for(MovieEntity entity: entities){
            dtos.add(this.movieEntity2DTO(entity));
        }
        return dtos;
    }
}
