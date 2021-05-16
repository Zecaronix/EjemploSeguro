package com.example.farmacias.services.impl;

import com.example.farmacias.entity.Seguro;
import com.example.farmacias.repository.SeguroRepository;
import com.example.farmacias.services.SeguroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SeguroServiceImpl implements SeguroService
{
    @Autowired
    private SeguroRepository seguroRepository;

    @Override
    public List<Seguro> listarSeguros()
    {

        List<Seguro> seguroList = new ArrayList<>();

        seguroList = seguroRepository.findAll();

        //hola GIT

        return seguroList;
    }

    @Override
    public Optional<Seguro> listarPorIdSeguro(Integer idEstado)
    {
        Optional<Seguro> seguro = seguroRepository.findById(idEstado);

        return seguro;
    }

    @Override
    public Seguro listarPorTipoSeguro(String nombreEstado)
    {
        Seguro seguro = seguroRepository.findAllByEstadoNombre(nombreEstado);

        return seguro;
    }

    @Override
    public Optional<Seguro> listarPorIdEstado(Integer idEstado)
    {
        Optional<Seguro> seguro = seguroRepository.findAllByEstadoId(idEstado);

        return seguro;
    }
}
