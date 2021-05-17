package com.example.farmacias.controller;

import com.example.farmacias.dto.ComputadoraDto;
import com.example.farmacias.entity.Computadora;
import com.example.farmacias.entity.Seguro;
import com.example.farmacias.services.ComputadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("computadora")
public class ComputadoraController
{
    @Autowired
    ComputadoraService computadoraService;

    @GetMapping("listar")
    public List<Computadora> listarComputadora()

    {
        return computadoraService.listarComputadora();
    }

    @GetMapping("listarMarcaPrecio/{marca}/{precio}")
    public List<Computadora> listarComputadoraPorMarcaPrecio(@PathVariable String marca,@PathVariable Float precio)
    {
        return computadoraService.listarComputadoraMarcaPrecio(marca, precio);
    }

    @GetMapping("listarComputadoraPorId/{id}")
    public Computadora listarComputadoraPorId(@PathVariable Integer id)
    {
        return computadoraService.listarComputadoraPorId(id);
    }

    @GetMapping("listarComputadoraDto")
    public List<ComputadoraDto> obtenerComputadoraDto ()
    {
        return computadoraService.listarComputadoraDto();
    }
}
