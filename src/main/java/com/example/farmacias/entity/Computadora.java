package com.example.farmacias.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "computadora")
@Getter
@Setter
public class Computadora
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nombre_computadora")
    private String nombre;

    @Column(name = "marca_computadora")
    private String marca;

    @Column(name = "memoria_computadora")
    private Integer memoria;

    @Column(name = "webcam_computadora")
    private Integer webcam;

    @Column(name = "precio_computadora")
    private Float precio;

    @OneToOne
    @JoinColumn (name = "procesaodor_id", referencedColumnName = "id")
    private Procesador procesador;

    @OneToOne
    @JoinColumn (name = "fabricante_id", referencedColumnName = "id")
    private Fabricante fabricante;

}
