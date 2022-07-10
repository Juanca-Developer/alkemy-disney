package com.alkemy.disney.disney.service;

import com.alkemy.disney.disney.dto.GeneroDto;
import org.springframework.stereotype.Service;

@Service
public class GeneroService {

    public GeneroDto save(GeneroDto dto){
        //TODO: guardar Genero
        System.out.println("Gardar Genero");
        return dto;
    }
}
