package com.alkemy.disney.disney.service;



import com.alkemy.disney.disney.dto.CharacterDto;


import java.util.List;


public interface CharacterService {

    CharacterDto save(CharacterDto dto);

    List<CharacterDto> getAllCharacters();

    CharacterDto update (Long id,CharacterDto dto);
    void delete(Long id);



}
