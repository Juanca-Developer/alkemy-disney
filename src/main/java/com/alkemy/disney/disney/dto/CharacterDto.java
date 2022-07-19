package com.alkemy.disney.disney.dto;

import com.alkemy.disney.disney.entity.PeliculaEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PersonajeDto {

    private Long id;
    private String imagen;
    private String nombre;
    private Long edad;
    private Long peso;
    private String historia;
    private List<PeliculaEntity> pelicula;

}
