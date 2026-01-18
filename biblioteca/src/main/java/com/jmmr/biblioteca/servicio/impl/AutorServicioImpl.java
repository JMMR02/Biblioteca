package com.jmmr.biblioteca.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jmmr.biblioteca.modelo.entidad.Autor;
import com.jmmr.biblioteca.repositorio.IAutorRepositorio;
import com.jmmr.biblioteca.servicio.IAutorServicio;

@Service
@Component
public class AutorServicioImpl implements IAutorServicio{
	
	@Autowired
	public IAutorRepositorio repositorioAutor;

	@Override
	public Autor insertarAutor(Autor nuevoAutor) {
		// TODO Auto-generated method stub
		return repositorioAutor.save(nuevoAutor);		
	}

	@Override
	public com.jmmr.biblioteca.modelo.entidad.Autor editarAutor(int idAutor) {
		// TODO Auto-generated method stub
		return repositorioAutor.findById(idAutor).get();
	}

	@Override
	public void eliminarAutor(int idAutor) {
		// TODO Auto-generated method stub
		repositorioAutor.delete(editarAutor(idAutor));
		
	}

	@Override
	public List<com.jmmr.biblioteca.modelo.entidad.Autor> listarAutor() {
		// TODO Auto-generated method stub
		return repositorioAutor.findAll();
	}

	
	

}
