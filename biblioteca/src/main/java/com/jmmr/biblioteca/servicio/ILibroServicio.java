package com.jmmr.biblioteca.servicio;

import java.util.List;

import com.jmmr.biblioteca.modelo.entidad.Libro;

public interface ILibroServicio {
	
	public Libro insertarLibro(Libro nuevoLibro);
	public Libro editarLibro(int idLibro);
	public void eliminarLibro(int idLibro);
	public List<Libro> listarLibro(); 		

}
