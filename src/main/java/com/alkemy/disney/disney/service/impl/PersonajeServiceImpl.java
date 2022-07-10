package com.alkemy.disney.disney.service;

import com.alkemy.disney.disney.dto.PersonajeDto;
import org.springframework.stereotype.Service;

@Service
public class PersonajeService {

    public PersonajeDto save(PersonajeDto dto){
        //TODO: guardar personaje
        System.out.println("Gardar Personaje");
        return dto;
    }
}
