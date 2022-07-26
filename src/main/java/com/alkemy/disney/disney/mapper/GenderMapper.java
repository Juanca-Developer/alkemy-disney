package com.alkemy.disney.disney.mapper;

import com.alkemy.disney.disney.dto.GenderDto;
import com.alkemy.disney.disney.entity.GenderEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GenderMapper {

    public GenderEntity genderDTO2Entity(GenderDto dto){
        GenderEntity genderEntity = new GenderEntity();
        genderEntity.setImagen(dto.getImagen());
        genderEntity.setNombre(dto.getNombre());
        return genderEntity;
    }
    public GenderDto genderEntity2DTO(GenderEntity entity){
        GenderDto dto = new GenderDto();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setNombre(entity.getNombre());
        return dto;
    }
    public List<GenderDto> genderEntityList2DTOList(List<GenderEntity> entities){
        List<GenderDto> dtos = new ArrayList<>();
        for(GenderEntity entity: entities){
            dtos.add(this.genderEntity2DTO(entity));
        }
        return dtos;
    }
}
