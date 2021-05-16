package com.example.farmacias.controller;

import com.example.farmacias.entity.Seguro;
import com.example.farmacias.services.SeguroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("seguro")
public class SeguroController
{
    @Autowired
    SeguroService seguroService;

    @GetMapping ("listar")
    public List<Seguro> obtenerSeguro()

    {
        return seguroService.listarSeguros();
    }

    @GetMapping ("listarPorIdSeguro/{idEstado}")
    public Seguro obtenerSeguroPorId(@PathVariable Integer idEstado)
    {
        return seguroService.listarPorIdSeguro(idEstado).get();
    }

    @GetMapping ("listarPorTipoSeguro/{nombreEstado}")
    public Seguro obtenerSegurPorTipoDeSeguro(@PathVariable String nombreEstado)
    {
        return  seguroService.listarPorTipoSeguro(nombreEstado);
    }

    @GetMapping ("listarPorEstadoId/{idestado}")
    public Seguro obtenerEstadoId(@PathVariable Integer idestado)
    {
        Seguro seguro = seguroService.listarPorIdEstado(idestado).get();
        return seguro;
    }
}
