package com.jmmr.biblioteca.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jmmr.biblioteca.modelo.entidad.Libro;
import com.jmmr.biblioteca.repositorio.ILibroRepositorio;
import com.jmmr.biblioteca.servicio.ILibroServicio;

@Service
@Component
public class LibroServicioImpl implements ILibroServicio{
	
	@Autowired
	public ILibroRepositorio repositorioLibro;

	@Override
	public Libro insertarLibro(Libro nuevoLibro) {
		// TODO Auto-generated method stub
		return repositorioLibro.save(nuevoLibro);
	}

	@Override
	public Libro editarLibro(int idLibro) {
		// TODO Auto-generated method stub
		return repositorioLibro.findById(idLibro).get();
	}

	@Override
	public void eliminarLibro(int idLibro) {
		// TODO Auto-generated method stub
		repositorioLibro.delete(editarLibro(idLibro));
		
	}

	@Override
	public List<Libro> listarLibro() {
		// TODO Auto-generated method stub
		return repositorioLibro.findAll();
	}
}

	
