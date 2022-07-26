package com.alkemy.disney.disney.service;

import com.alkemy.disney.disney.dto.GenderDto;

import java.util.List;

public interface GenderService {

    GenderDto save(GenderDto dto);

    List<GenderDto> getAllGeneros();
}
