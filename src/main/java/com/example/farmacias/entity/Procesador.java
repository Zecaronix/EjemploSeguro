package com.example.farmacias.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "procesador")
@Getter
@Setter
public class Procesador
{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    @Column (name = "nombre_procesador")
    private String nombre;

    @Column (name = "nombre_generacion")
    private Integer generacion;

}
