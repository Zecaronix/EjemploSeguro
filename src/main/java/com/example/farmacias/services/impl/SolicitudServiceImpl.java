package com.example.farmacias.services.impl;

import com.example.farmacias.dto.SolicitudDto;
import com.example.farmacias.dto.SolicitudEjemploDto;
import com.example.farmacias.dto.SolicitudGeneralDto;
import com.example.farmacias.entity.Solicitud;
import com.example.farmacias.repository.SolicitudRepository;
import com.example.farmacias.services.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SolicitudServiceImpl implements SolicitudService
{
    @Autowired
    private SolicitudRepository solicitudRepository;

    @Override
    public List<Solicitud> listarSolicitud()
    {
        return solicitudRepository.findAll();
    }

//    @Override
//    public List<Solicitud> listarNroSolicitud(Integer nroSolicitud)
//    {
//        return solicitudRepository.findAllByNroSolicitud(nroSolicitud);
//    }



    @Override
    public List<SolicitudDto> listarSolicitudDto() {

//        Solicitud soli = new Solicitud();
//        List<List<Solicitud>> solicitudmap = null;metodo 1 MAP
//        Map<String, List<SolicitudDto>> solicitudmap = new HashMap<>();metodo 2 MAP

        List<Solicitud> solicitudList = new ArrayList<>();//crea uno nuevo pero vacio
        System.out.println(solicitudList);//lo imprime vacio
        solicitudList = solicitudRepository.findAll();//lista lo que quiero consultar

        List<SolicitudDto> solicitudDtos = new ArrayList<>();//crea de nuevo uno vacio


        for (int i = 0; i < solicitudList.size(); i++)

        {//sentencia para - desde 0 hasta que se llene y se repita

            SolicitudDto solicitudDto = new SolicitudDto();//se crea uno nuevo
            solicitudDto.setNroSolicitud(solicitudList.get(i).getNroSolicitud());//se usa el i para get y set

//            Solicitud solicitud = new Solicitud();

            //switch case
            switch (solicitudList.get(i).getIdEstado())
            {
                case 1:
                    solicitudDto.setIdEstado("Activo");
                    break;
                case 2:
                    solicitudDto.setIdEstado("Espera");
                    break;
                case 3:
                    solicitudDto.setIdEstado("Observado");
                    break;
                case 4:
                    solicitudDto.setIdEstado("Atendido");
                    break;
                case 5:
                    solicitudDto.setIdEstado("Archivado");
                    break;
                default:
            }

//            if (solicitudList.get(i).getIdEstado() == 1){ //1er metodo de if
//                solicitudDto.setIdEstado("Activo");
//            }else if (solicitudList.get(i).getIdEstado() == 2){
//                solicitudDto.setIdEstado("En espera");
//            }
//            else if (solicitudList.get(i).getIdEstado() == 3){
//                solicitudDto.setIdEstado("Observado");
//            }
//            else if (solicitudList.get(i).getIdEstado() == 4){
//                solicitudDto.setIdEstado("Atendido");
//            }
//            else if (solicitudList.get(i).getIdEstado() == 5){
//                solicitudDto.setIdEstado("Archivado");
//            }
//            solicitudDto.setIdEstado(solicitudList.get(i).getIdEstado() == 1? "Asignado": "no asignado");//2do metodo de if (ternario)
//
            solicitudDtos.add(solicitudDto);//se le agrega un objeto a otra lista
//            solicitudmap.put("mapeo", solicitudDtos);llenado de MAP

        }


        return solicitudDtos;//retorna la solicitud
    }

    @Override
    public List<SolicitudGeneralDto> listarSolicitudGeneralDto()
    {

        List<Solicitud> solicitudList = new ArrayList<>();//crea uno nuevo pero vacio
        System.out.println(solicitudList);//lo imprime vacio
        solicitudList = solicitudRepository.findAll();//lista lo que quiero consultar

        List<SolicitudGeneralDto> solicitudGeneralDtos = new ArrayList<>();//crea de nuevo uno vacio - instanciando un listado


        for (int i = 0; i < solicitudList.size(); i++) {//sentencia para - desde 0 hasta que se llene y se repita

            SolicitudGeneralDto solicitudGeneralDto = new SolicitudGeneralDto();//se crea uno nuevo objeto en vacio (instanciar)
            solicitudGeneralDto.setSolicitud(solicitudList.get(i));//se usa el i para get y set
            solicitudGeneralDtos.add(solicitudGeneralDto);
        }

        return solicitudGeneralDtos;

    }

    @Override
    public List<SolicitudEjemploDto> listarSolicitudEjemploDto()
    {
        List<Solicitud> solicitudList = new ArrayList<>();
                System.out.println(solicitudList);
                solicitudList = solicitudRepository.findAll();

        List<SolicitudEjemploDto> solicitudEjemploDtos = new ArrayList<>();

        for (int i = 0; i < solicitudList.size(); i++)
        {
            SolicitudEjemploDto solicitudEjemploDto = new SolicitudEjemploDto();
            solicitudEjemploDto.setNroSolicitud(solicitudList.get(i).getNroSolicitud());
            solicitudEjemploDto.setIngresoSolicitud(solicitudList.get(i).getIngresoSolicitud());
            solicitudEjemploDto.setNomEstado(solicitudList.get(i).getEstado().getNombre());
            solicitudEjemploDto.setNomConvenio(solicitudList.get(i).getConvenio().getNombre());
            solicitudEjemploDto.setDistrito(solicitudList.get(i).getConvenio().getDireccion().getDistrito());
            solicitudEjemploDto.setDireccion(solicitudList.get(i).getConvenio().getDireccion().getDireccion());

            solicitudEjemploDtos.add(solicitudEjemploDto);
        }

        return solicitudEjemploDtos;
    }

    @Override
    public SolicitudEjemploDto listarPorNroSolicitud(Integer nroSolicitud)
    {

        Solicitud solicitud = new Solicitud();
        solicitud = solicitudRepository.findAllByNroSolicitud(nroSolicitud);

        SolicitudEjemploDto solicitudEjemploDto = new SolicitudEjemploDto();

        solicitudEjemploDto.setNroSolicitud(solicitud.getNroSolicitud());
        solicitudEjemploDto.setIngresoSolicitud(solicitud.getIngresoSolicitud());
        solicitudEjemploDto.setDireccion(solicitud.getConvenio().getDireccion().getDireccion());
        solicitudEjemploDto.setDistrito(solicitud.getConvenio().getDireccion().getDistrito());
        solicitudEjemploDto.setNomEstado(solicitud.getEstado().getNombre());
        solicitudEjemploDto.setNomConvenio(solicitud.getConvenio().getNombre());

        return solicitudEjemploDto;
    }

    @Override
    public SolicitudEjemploDto listarPorIdEstado(Integer IdEstado)
    {
        Solicitud solicitud = new Solicitud();
        solicitud = solicitudRepository.findAllByIdEstado(IdEstado);

        SolicitudEjemploDto solicitudEjemploDto = new SolicitudEjemploDto();

        solicitudEjemploDto.setNroSolicitud(solicitud.getNroSolicitud());
        solicitudEjemploDto.setIngresoSolicitud(solicitud.getIngresoSolicitud());
        solicitudEjemploDto.setDireccion(solicitud.getConvenio().getDireccion().getDireccion());
        solicitudEjemploDto.setDistrito(solicitud.getConvenio().getDireccion().getDistrito());
        solicitudEjemploDto.setNomEstado(solicitud.getEstado().getNombre());
        solicitudEjemploDto.setNomConvenio(solicitud.getConvenio().getNombre());

        return solicitudEjemploDto;
    }

}
