package com.alkemy.disney.disney.service.impl;

import com.alkemy.disney.disney.dto.GenderDto;
import com.alkemy.disney.disney.entity.GenderEntity;
import com.alkemy.disney.disney.mapper.GenderMapper;
import com.alkemy.disney.disney.repository.GenderRepository;
import com.alkemy.disney.disney.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderServiceImpl implements GenderService {

    @Autowired
    private GenderMapper genderMapper;

    @Autowired
    private GenderRepository genderRepository;

    public GenderDto save(GenderDto dto){
        GenderEntity entity = genderMapper.genderDTO2Entity(dto);
        GenderEntity entitySaved = genderRepository.save(entity);
        GenderDto result = genderMapper.genderEntity2DTO(entitySaved);
        return result;
    }


    public List<GenderDto> getAllGeneros() {
        List<GenderEntity> entities = genderRepository.findAll();
        List<GenderDto>result = genderMapper.genderEntityList2DTOList(entities);
        return result;
    }
}
