package com.example.farmacias.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="solicitud")
@Getter
@Setter
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="nro_solicitud")
    private Integer nroSolicitud;

    @Column(name="ingreso_solicitud")
    private LocalDate ingresoSolicitud;

    @Column(name="id_afiliado")
    private Integer idAfiliado;

    @Column(name="id_convenio")
    private Integer idConvenio;

    @Column(name="id_agente")
    private Integer idAgente;

    @Column(name="id_estado")
    private Integer idEstado;

    @Column(name="id_direccion")
    private Integer idDireccion;

    @OneToOne
    @JoinColumn (name = "estado_id", referencedColumnName = "id")
    private Estado estado;

    @OneToOne
    @JoinColumn (name = "convenio_id", referencedColumnName = "id")
    private Convenio convenio;

}
