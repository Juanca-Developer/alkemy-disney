package com.alkemy.disney.disney.controller;

import com.alkemy.disney.disney.dto.GeneroDto;
import com.alkemy.disney.disney.service.GeneroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("generos")
public class GeneroController {

    @Autowired
    private GeneroService generoService;

    @GetMapping
    public ResponseEntity<List<GeneroDto>> getAll() {
        List<GeneroDto> generos = generoService.getAllGeneros();
        return ResponseEntity.ok().body(generos);
    }


    @PostMapping
    public ResponseEntity<GeneroDto> save(@RequestBody GeneroDto genero){
        GeneroDto generoGuardado =  generoService.save(genero);
        return ResponseEntity.status(HttpStatus.CREATED).body(generoGuardado);
    }

}
