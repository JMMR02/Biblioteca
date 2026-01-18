package com.jmmr.biblioteca.servicio;

import java.util.List;

import com.jmmr.biblioteca.modelo.entidad.Autor;

public interface IAutorServicio {
	
	public Autor insertarAutor(Autor nuevoAutor);
	public Autor editarAutor(int idAutor);
	public void eliminarAutor(int idAutor);
	public List<Autor> listarAutor(); 
		

}
