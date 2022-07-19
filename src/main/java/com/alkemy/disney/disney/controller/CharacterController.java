package com.alkemy.disney.disney.controller;


import com.alkemy.disney.disney.dto.PersonajeDto;
import com.alkemy.disney.disney.service.impl.PersonajeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("personajes")
public class PersonajeController {

    @Autowired
    private PersonajeServiceImpl personajeServiceImpl;

    @PostMapping
    public ResponseEntity<PersonajeDto> save(@RequestBody PersonajeDto personaje){
        PersonajeDto personajeGuardado = personajeServiceImpl.save(personaje);
        return ResponseEntity.status(HttpStatus.CREATED).body(personajeGuardado);
    }


}
