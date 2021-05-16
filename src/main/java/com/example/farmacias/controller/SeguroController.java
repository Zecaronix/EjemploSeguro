package com.example.farmacias.controller;

import com.example.farmacias.entity.Seguro;
import com.example.farmacias.services.SeguroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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


}
