package com.alkemy.disney.disney.entity;

import lombok.Getter;
import lombok.Setter;


import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "pelicula")
@Getter
@Setter
public class PeliculaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String imagen;
    private String titulo;


    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate fechaCreacion;

    private Long calificacion;

    @ManyToOne(fetch= FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "genero_id", insertable = false, updatable = false )
    private GenderEntity genero;

    @Column(name = "genero_id", nullable = false)
    private Long generoId;

    @ManyToMany(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE,
            })
   @JoinTable(
           name = "pelicula_personaje",
           joinColumns = @JoinColumn(name = "pelicula_id"),
           inverseJoinColumns = @JoinColumn(name="personaje_id"))
    private Set <PersonajeEntity> personajes = new HashSet<>();


}
