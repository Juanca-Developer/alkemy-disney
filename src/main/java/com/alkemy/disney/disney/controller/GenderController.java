package com.alkemy.disney.disney.controller;

import com.alkemy.disney.disney.dto.GenderDto;
import com.alkemy.disney.disney.service.GenderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("genders")
public class GenderController {

    @Autowired
    private GenderService genderService;

    @GetMapping
    public ResponseEntity<List<GenderDto>> getAll() {
        List<GenderDto> genders = genderService.getAllGeneros();
        return ResponseEntity.ok().body(genders);
    }


    @PostMapping
    public ResponseEntity<GenderDto> save(@RequestBody GenderDto gender){
        GenderDto genderSave =  genderService.save(gender);
        return ResponseEntity.status(HttpStatus.CREATED).body(genderSave);
    }

}
