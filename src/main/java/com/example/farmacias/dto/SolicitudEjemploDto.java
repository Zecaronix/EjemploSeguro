package com.example.farmacias.dto;

import com.example.farmacias.entity.Solicitud;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class SolicitudEjemploDto
{
    private Integer nroSolicitud;
    private LocalDate ingresoSolicitud;
    private String nomEstado;
    private String nomConvenio;
    private String distrito;
    private String direccion;
}
