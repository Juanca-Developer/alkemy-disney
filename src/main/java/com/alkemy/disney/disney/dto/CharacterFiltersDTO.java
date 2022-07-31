package com.alkemy.disney.disney.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CharacterFiltersDTO {
    
    private String nombre;
    private Long edad;
    private Long peso;
    private List<Long> pelicula;
}
