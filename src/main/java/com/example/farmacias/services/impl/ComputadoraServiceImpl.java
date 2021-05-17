package com.example.farmacias.services.impl;

import com.example.farmacias.dto.ComputadoraDto;
import com.example.farmacias.entity.Computadora;
import com.example.farmacias.repository.ComputadoraRepository;
import com.example.farmacias.services.ComputadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComputadoraServiceImpl implements ComputadoraService
{
    @Autowired
    private ComputadoraRepository computadoraRepository;

    @Override
    public List<Computadora> listarComputadora()
    {
        List<Computadora> computadoraList = new ArrayList<>();
        computadoraList = computadoraRepository.findAll();

        return computadoraList;
    }

    @Override
    public List<Computadora> listarComputadoraMarcaPrecio(String marca, Float precio)
    {
        List<Computadora> computadoraList = new ArrayList<>();
        computadoraList = computadoraRepository.findAllByMarcaAndPrecio(marca, precio);

        return computadoraList;
    }

    @Override
    public Computadora listarComputadoraPorId(Integer id)
    {
        Computadora computadora = new Computadora();
        computadora = computadoraRepository.findAllById(id);
        return computadora;
    }

    @Override
    public List<ComputadoraDto> listarComputadoraDto()
    {
        List<ComputadoraDto> computadoraDtoList = new ArrayList<>();
        List<Computadora> computadoraList = computadoraRepository.findAll();

        for (int i = 0; i < computadoraList.size(); i++)
        {
            ComputadoraDto computadoraDto = new ComputadoraDto();
            computadoraDto.setNombreComputadora(computadoraList.get(i).getNombre());
            computadoraDto.setMarcaComputadora(computadoraList.get(i).getMarca());
            computadoraDto.setNombreFabricante(computadoraList.get(i).getNombre());
            computadoraDto.setNombreProcesador(computadoraList.get(i).getNombre());

            computadoraDtoList.add(computadoraDto);
        }

        return computadoraDtoList;
    }


}
