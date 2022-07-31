package com.alkemy.disney.disney.service.impl;


import com.alkemy.disney.disney.dto.CharacterDto;
import com.alkemy.disney.disney.entity.CharacterEntity;
import com.alkemy.disney.disney.mapper.CharacterMapper;
import com.alkemy.disney.disney.repository.CharacterRepository;
import com.alkemy.disney.disney.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    CharacterMapper characterMapper;

    @Autowired
    CharacterRepository characterRepository;

    public CharacterDto save(CharacterDto dto){
        CharacterEntity entity = characterMapper.characterDTO2Entity(dto);
        CharacterEntity entitySaved = characterRepository.save(entity);
        CharacterDto result = characterMapper.characterEntity2DTO(entitySaved);
       return result;
    }
    public List<CharacterDto> getAllCharacters() {
        List<CharacterEntity> entities =  characterRepository.findAll();
        List<CharacterDto>result = characterMapper.characterEntityList2DTOList(entities);
        return result;
    }
    public CharacterDto update (Long id,CharacterDto dto){
        Optional<CharacterEntity> entitySaved = characterRepository.findById(id);
        CharacterEntity entity = entitySaved.get();
        entity.setImagen(dto.getImagen());
        entity.setNombre(dto.getNombre());
        entity.setEdad(dto.getEdad());
        entity.setPeso(dto.getPeso());
        entity.setHistoria(dto.getHistoria());
        entity.setPeliculas(dto.getPelicula());
        CharacterEntity entityUpdated = characterRepository.save(entity);
        CharacterDto result = characterMapper.characterEntity2DTO(entityUpdated);
        return result;
    }

    public void delete(Long id) {
        this.characterRepository.deleteById(id);

    }
}
