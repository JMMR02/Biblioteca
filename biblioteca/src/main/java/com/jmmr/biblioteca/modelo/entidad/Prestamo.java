package com.jmmr.biblioteca.modelo.entidad;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Prestamo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPrestamo;

    private Date fechaInicio;
    private Date fechaFin;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    @JsonManagedReference
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_libro")
    @JsonManagedReference
    private Libro libro;
}
