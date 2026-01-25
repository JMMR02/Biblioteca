package com.jmmr.biblioteca.modelo.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.ToString;

@Entity
@Data

public class Libro implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int idLibro;
	private String titulo;
	private String isbn;
	
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	@JsonManagedReference
	private Categoria categoria;

	@ManyToOne
	@JoinColumn(name = "id_autor")
	@JsonManagedReference
	private Autor autor;

	@ToString.Exclude
	@OneToMany(mappedBy = "libro")
	@JsonBackReference
	private List<Prestamo> listaPrestamos = new ArrayList<>();
	
}
