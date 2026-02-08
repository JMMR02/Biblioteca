package com.jmmr.biblioteca.controlador;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmmr.biblioteca.modelo.entidad.Libro;
import com.jmmr.biblioteca.modelo.entidad.Prestamo;
import com.jmmr.biblioteca.modelo.entidad.Usuario;
import com.jmmr.biblioteca.servicio.ILibroServicio;
import com.jmmr.biblioteca.servicio.IPrestamoServicio;
import com.jmmr.biblioteca.servicio.IUsuarioServicio;

@RestController
@RequestMapping("/api/prestamo")
public class PrestamoControlador {

	   @Autowired
	    private IPrestamoServicio servicioPrestamo;

	    @Autowired
	    private ILibroServicio servicioLibro;

	    @Autowired
	    private IUsuarioServicio servicioUsuario;

	    @GetMapping
	    public List<Prestamo> listarPrestamo() {
	        return servicioPrestamo.listarPrestamo();
	    }	    

	    @PostMapping
	    public Prestamo crearPrestamo(@RequestBody Prestamo prestamo) {

	        if (prestamo.getLibro() != null &&
	            prestamo.getLibro().getIdLibro() > 0 &&
	            prestamo.getUsuario() != null &&
	            prestamo.getUsuario().getIdUsuario() > 0) {

	            Libro libro = servicioLibro.editarLibro(
	                    prestamo.getLibro().getIdLibro());

	            Usuario usuario = servicioUsuario.editarUsuario(
	                    prestamo.getUsuario().getIdUsuario());

	            if (libro != null) {
	                prestamo.setLibro(libro);
	            } else {
	                throw new RuntimeException("El libro no existe");
	            }

	            if (usuario != null) {
	                prestamo.setUsuario(usuario);
	            } else {
	                throw new RuntimeException("El usuario no existe");
	            }

	        } else {
	            throw new RuntimeException("Falta libro o usuario");
	        }

	        return servicioPrestamo.insertarPrestamo(prestamo);
	    }

	    @GetMapping("/{id}")
	    public Prestamo editarPrestamo(@PathVariable int id) {
	        return servicioPrestamo.editarPrestamo(id);
	    }

	    @DeleteMapping("/{id}")
	    public void eliminarPrestamo(@PathVariable int id) {
	        servicioPrestamo.eliminarPrestamo(id);
	    }
	}

