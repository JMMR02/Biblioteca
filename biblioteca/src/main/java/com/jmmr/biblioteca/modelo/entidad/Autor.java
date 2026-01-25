package com.jmmr.biblioteca.modelo.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.jmmr.biblioteca.BibliotecaApplication;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
public class Autor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int idAutor;
	private String nombre;
	private String nacionalidad;
	
	@ToString.Exclude
	@OneToMany(mappedBy = "autor", cascade = CascadeType.REFRESH)
	@JsonBackReference
	private List<Libro> listaLibros = new ArrayList<>();
	
	

}
