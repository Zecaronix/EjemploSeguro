package com.example.farmacias.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.websocket.server.ServerEndpoint;

@Entity
@Table (name = "direccion")
@Getter
@Setter
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String direccion;

    @Column
    private String distrito;

    @Column
    private String referencia;

    @Column
    private String tipoVivienda;

}
