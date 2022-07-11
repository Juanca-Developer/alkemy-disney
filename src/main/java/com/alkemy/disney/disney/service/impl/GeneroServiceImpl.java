package com.alkemy.disney.disney.service.impl;

import com.alkemy.disney.disney.dto.GeneroDto;
import com.alkemy.disney.disney.entity.GeneroEntity;
import com.alkemy.disney.disney.mapper.GeneroMapper;
import com.alkemy.disney.disney.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroServiceImpl implements GeneroService {

    @Autowired
    private GeneroMapper generoMapper;

    @Autowired
    private GeneroRepository generoRepository;

    public GeneroDto save(GeneroDto dto){
        GeneroEntity entity = generoMapper.generoDTO2Entity(dto);
        GeneroEntity entitySaved = generoRepository.save(entity);
        GeneroDto result = generoMapper.generoEntity2DTO(entitySaved);
        return result;
    }


    public List<GeneroDto> getAllGeneros() {
        List<GeneroEntity> entities = generoRepository.findAll();
        List<GeneroDto>result = generoMapper.generoEntityList2DTOList(entities);
        return result;
    }
}
