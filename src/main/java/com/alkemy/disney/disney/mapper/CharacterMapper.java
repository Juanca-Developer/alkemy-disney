package com.alkemy.disney.disney.mapper;


import com.alkemy.disney.disney.dto.CharacterDto;
import com.alkemy.disney.disney.entity.CharacterEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class CharacterMapper {

    public CharacterEntity characterDTO2Entity(CharacterDto dto){
        CharacterEntity characterEntity = new CharacterEntity();
        characterEntity.setImagen(dto.getImagen());
        characterEntity.setNombre(dto.getNombre());
        characterEntity.setEdad(dto.getEdad());
        characterEntity.setPeso(dto.getPeso());
        characterEntity.setHistoria(dto.getHistoria());
        characterEntity.setPeliculas(dto.getPelicula());

        return characterEntity;
    }
    public CharacterDto characterEntity2DTO(CharacterEntity entity){
        CharacterDto dto = new CharacterDto();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setNombre(entity.getNombre());
        dto.setEdad(entity.getEdad());
        dto.setPeso(entity.getPeso());
        dto.setHistoria(entity.getHistoria());
        dto.setPelicula(entity.getPeliculas());
        return dto;
    }
    public List<CharacterDto> characterEntityList2DTOList(List<CharacterEntity> entities){
        List<CharacterDto> dtos = new ArrayList<>();
        for(CharacterEntity entity: entities){
            dtos.add(this.characterEntity2DTO(entity));
        }
        return dtos;
    }
   
    public List<CharacterDto> characterEntitySet2DTOList(Collection<CharacterEntity> entities, boolean loadTitles)
    {
        List<CharacterDto> dtos = new ArrayList<>();

        for(CharacterEntity entity : entities)
        {
            dtos.add(this.characterEntity2DTO(entity));
        }

        return dtos;
    }
}
