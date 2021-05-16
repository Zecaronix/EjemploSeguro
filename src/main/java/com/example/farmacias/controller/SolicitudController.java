package com.example.farmacias.controller;

import com.example.farmacias.dto.SolicitudDto;
import com.example.farmacias.dto.SolicitudEjemploDto;
import com.example.farmacias.dto.SolicitudGeneralDto;
import com.example.farmacias.entity.Solicitud;
import com.example.farmacias.services.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //declarar que esta clase es un metodo rest
@RequestMapping("solicitud") //darle un nombre de ruta a la clase controller, path padre
public class SolicitudController {

    @Autowired
    private SolicitudService solicitudService;

    @GetMapping ("listar") //indica que el motodo es get y lista algo, path hijo
    public List<Solicitud> obtenerSolicitud(){


        return solicitudService.listarSolicitud();
    }
    //indicara que el metodo es get y moestrará el path para poder mostrar los resultados de la consulta
    @GetMapping ("listarSolicitudDto") //indica que el motodo es get y lista algo, path hijo
    public List<SolicitudDto> obtenerSolicitudDto(){


        return solicitudService.listarSolicitudDto();
    }

//    @PostMapping("save")
//    public Solicitud guardaSolicitud(@RequestBody Solicitud solicitudRequest){
//
//        return solicitudService.save(solicitudRequest);
//    }

    @GetMapping ("listarSolicitudGeneral")
    public List<SolicitudGeneralDto> obtenerSolicitdudGeneralDto()
    {

        return solicitudService.listarSolicitudGeneralDto();
    }

    @GetMapping ("listarSolicitudEjemplo")
    public List<SolicitudEjemploDto> obtenerSolicitudEjemploDt()
    {
        return solicitudService.listarSolicitudEjemploDto();
    }

    @GetMapping ("listarNroSolicitud/{nro}")
    public SolicitudEjemploDto listarPorNroSolicitud(@PathVariable Integer nro)
    {
        return solicitudService.listarPorNroSolicitud(nro);
    }

}
