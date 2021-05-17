package com.example.farmacias.services;

import com.example.farmacias.dto.ComputadoraDto;
import com.example.farmacias.entity.Computadora;

import java.util.List;

public interface ComputadoraService
{
    List<Computadora> listarComputadora();
    List<Computadora> listarComputadoraMarcaPrecio(String marca, Float precio);
    Computadora listarComputadoraPorId (Integer id);
    List<ComputadoraDto> listarComputadoraDto();
}
