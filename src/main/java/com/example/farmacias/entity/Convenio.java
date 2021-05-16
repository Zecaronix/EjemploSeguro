package com.example.farmacias.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

    @Entity
    @Table (name = "convenio")
    @Getter
    @Setter
    public class Convenio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column (name = "nombre_convenio")
    private String nombre;


    @OneToOne
    @JoinColumn (name = "direccion_id", referencedColumnName = "id")
    private Direccion direccion;

    }
