package com.example.farmacias.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// se crea una nueva clase dentro del package dto para poder manipular la data (consultas y demas)
public class SolicitudDto {

    //  se declaran las variables que se deasean consultar
    private Integer nroSolicitud;
    private String idEstado;

}
