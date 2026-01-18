package com.jmmr.biblioteca.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jmmr.biblioteca.modelo.entidad.Categoria;
import com.jmmr.biblioteca.repositorio.ICategoriaRepositorio;
import com.jmmr.biblioteca.servicio.ICategoriaServicio;

@Service
@Component
public class CategoriaServicioImpl implements ICategoriaServicio {

	@Autowired
	public ICategoriaRepositorio repositorioCategoria;
    
	@Override
	public Categoria insertarCategoria(Categoria nuevaCategoria) {
		// TODO Auto-generated method stub
		return repositorioCategoria.save(nuevaCategoria);
	}

	@Override
	public Categoria editarCategoria(int idCategoria) {
		// TODO Auto-generated method stub
		return repositorioCategoria.findById(idCategoria).get();
	}

	@Override
	public void eliminarCategoria(int idCategoria) {
		// TODO Auto-generated method stub
		repositorioCategoria.delete(editarCategoria(idCategoria));
		
	}

	@Override
	public List<Categoria> listarCategoria() {
		// TODO Auto-generated method stub
		return repositorioCategoria.findAll();
	}

}
