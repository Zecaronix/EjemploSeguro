package com.example.farmacias.repository;

import com.example.farmacias.entity.Seguro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface SeguroRepository extends JpaRepository <Seguro, Integer>
{
    Optional<Seguro> findById (Integer idEstado); //el metodo findallbyid por medio del parametro id, te regresa un objeto Seguro
    Seguro findAllByEstadoNombre (String nombreEstado);
    Optional<Seguro> findAllByEstadoId (Integer idEstado);
}
