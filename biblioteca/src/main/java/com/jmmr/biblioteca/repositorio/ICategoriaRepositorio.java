package com.jmmr.biblioteca.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmmr.biblioteca.modelo.entidad.Categoria;

@Repository
public interface ICategoriaRepositorio extends JpaRepository<Categoria, Integer> {
}

