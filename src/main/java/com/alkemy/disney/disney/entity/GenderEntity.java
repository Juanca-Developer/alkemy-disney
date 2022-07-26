package com.alkemy.disney.disney.entity;


import lombok.Getter;
import lombok.Setter;



import javax.persistence.*;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "genero")
@Getter
@Setter
public class GenderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String imagen;

}
