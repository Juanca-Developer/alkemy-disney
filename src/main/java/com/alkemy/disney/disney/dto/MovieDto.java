package com.alkemy.disney.disney.dto;

import com.alkemy.disney.disney.entity.CharacterEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class MovieDto {

    private Long id;
    private String image;
    private String titulo;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate fechaCreacion;
    private Long calificacion;
    private Long genderId;
    private Set<CharacterEntity> personajes = new HashSet<>();

}
