package com.example.farmacias.services.impl;

import com.example.farmacias.entity.Seguro;
import com.example.farmacias.repository.SeguroRepository;
import com.example.farmacias.services.SeguroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
}
