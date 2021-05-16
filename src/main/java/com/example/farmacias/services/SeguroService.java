package com.example.farmacias.services;

import com.example.farmacias.entity.Seguro;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface SeguroService
{

    List<Seguro> listarSeguros();
    Optional<Seguro> listarPorIdSeguro(Integer id);
    Seguro listarPorTipoSeguro(String tseguro);
    Optional<Seguro> listarPorIdEstado(Integer idEstado);

}
