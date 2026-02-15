package com.jmmr.biblioteca.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmmr.biblioteca.modelo.entidad.Autor;
import com.jmmr.biblioteca.modelo.entidad.Categoria;
import com.jmmr.biblioteca.modelo.entidad.Libro;
import com.jmmr.biblioteca.repositorio.IAutorRepositorio;
import com.jmmr.biblioteca.repositorio.ICategoriaRepositorio;
import com.jmmr.biblioteca.repositorio.ILibroRepositorio;
import com.jmmr.biblioteca.servicio.ILibroServicio;

@Service
public class LibroServicioImpl implements ILibroServicio {

    @Autowired
    private ILibroRepositorio repositorioLibro;

    @Override
    public Libro insertarLibro(Libro nuevoLibro) {
        return repositorioLibro.save(nuevoLibro);
    }

    @Override
    public Libro editarLibro(int idLibro) {
        return repositorioLibro.findById(idLibro).get();
    }

    @Override
    public void eliminarLibro(int idLibro) {
        repositorioLibro.deleteById(idLibro);
    }

    @Override
    public List<Libro> listarLibro() {
        return repositorioLibro.findAll();
    }
}
