package com.alkemy.disney.disney.service.impl;


import com.alkemy.disney.disney.dto.PersonajeDto;
import com.alkemy.disney.disney.entity.PersonajeEntity;
import com.alkemy.disney.disney.mapper.PersonajeMapper;
import com.alkemy.disney.disney.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeServiceImpl {

    @Autowired
    PersonajeMapper personajeMapper;

    @Autowired
    PersonajeRepository personajeRepository;
    public PersonajeDto save(PersonajeDto dto){
        PersonajeEntity entity = personajeMapper.personjeDTO2Entity(dto);
        PersonajeEntity entitySaved = personajeRepository.save(entity);
        PersonajeDto result = personajeMapper.personajeEntity2DTO(entitySaved);
       return result;
    }


}
