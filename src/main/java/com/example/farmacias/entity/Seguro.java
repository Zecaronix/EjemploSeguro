package com.example.farmacias.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name = "seguro")
@Getter
@Setter
public class Seguro
{

    @Id
    @GeneratedValue
    private Integer Id;

    @Column(name = "tipo_seguro")
    private String tSeguro;

    @OneToOne
    @JoinColumn (name = "estado_id", referencedColumnName = "id")
    private Estado estado;

    @OneToOne
    @JoinColumn (name = "direccion_id", referencedColumnName = "id")
    private Direccion direccion;

}
