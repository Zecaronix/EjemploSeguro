package com.example.farmacias.services;

import com.example.farmacias.dto.SolicitudDto;
import com.example.farmacias.dto.SolicitudEjemploDto;
import com.example.farmacias.dto.SolicitudGeneralDto;
import com.example.farmacias.entity.Solicitud;

import java.util.List;

public interface SolicitudService {

    //se declara los valores de la libreria JPA, los cuales usaremos para poder listar
    List<Solicitud> listarSolicitud();
//  List<Solicitud> listarNroSolicitud(Integer nroSolicitud);//se introduce el tipo de dato + variable de "Solicitud" a usar
    List<SolicitudDto> listarSolicitudDto();
    List<SolicitudGeneralDto> listarSolicitudGeneralDto();
    List<SolicitudEjemploDto> listarSolicitudEjemploDto();
    SolicitudEjemploDto listarPorNroSolicitud(Integer nroSolicitud);
//    Solicitud save(Solicitud solicitud);
    SolicitudEjemploDto listarPorIdEstado(Integer IdEstado);
}
