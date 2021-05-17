package com.example.farmacias.repository;

import com.example.farmacias.dto.ComputadoraDto;
import com.example.farmacias.entity.Computadora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComputadoraRepository extends JpaRepository <Computadora, Integer>
{
    List<Computadora> findAll ();
    List<Computadora> findAllByMarcaAndPrecio (String marca, Float precio);
    Computadora findAllById (Integer id);
}
