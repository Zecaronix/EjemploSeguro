package com.example.farmacias.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name = "fabricante")
@Getter
@Setter
public class Fabricante
{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    @Column (name = "nombre_fabricante")
    private String nombre;
}
