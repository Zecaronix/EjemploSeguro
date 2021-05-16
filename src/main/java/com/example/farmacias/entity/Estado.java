package com.example.farmacias.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name="estado")
@Getter
@Setter
public class Estado {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nombre_estado")
    private String nombre;


}
