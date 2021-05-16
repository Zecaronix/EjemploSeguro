package com.example.farmacias.repository;

import com.example.farmacias.dto.SolicitudEjemploDto;
import com.example.farmacias.entity.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SolicitudRepository extends JpaRepository<Solicitud,Integer>
{
//    List<Solicitud> findAllByNroSolicitud(Integer nroSolicitud);
    Solicitud findAllByNroSolicitud (Integer nroSolicitud);
    Solicitud findAllByIdEstado (Integer IdEstado);

}
