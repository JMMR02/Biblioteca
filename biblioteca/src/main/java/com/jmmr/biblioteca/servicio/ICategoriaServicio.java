package com.jmmr.biblioteca.servicio;

import java.util.List;

import com.jmmr.biblioteca.modelo.entidad.Categoria;

public interface ICategoriaServicio {
	
	public Categoria insertarCategoria(Categoria nuevaCategoria);
	public Categoria editarCategoria(int idCategoria);
	public void eliminarCategoria(int idCategoria);
	public List<Categoria> listarCategoria();		

}
