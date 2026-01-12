package com.jmmr.biblioteca.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jmmr.biblioteca.modelo.entidad.*;

@Repository
@Component

public interface ILibroRepositorio extends JpaRepository<Integer, Libro>{

}
