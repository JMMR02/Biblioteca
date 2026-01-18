package com.jmmr.biblioteca.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmmr.biblioteca.modelo.entidad.Autor;

@Repository
public interface IAutorRepositorio extends JpaRepository<Autor, Integer> {
}





