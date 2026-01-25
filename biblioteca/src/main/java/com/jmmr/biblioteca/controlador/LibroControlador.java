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
import com.jmmr.biblioteca.servicio.ILibroServicio;

@RestController
@RequestMapping("/api/libro")
public class LibroControlador {

	@Autowired
	private ILibroServicio servicioLibro;
	
	@GetMapping
	public List <Libro> listarLibro(){
		return servicioLibro.listarLibro();
	}
	
	@PostMapping
	public Libro crearLibro(@RequestBody Libro libro) {
		return servicioLibro.insertarLibro(libro);		
	}	
	
	@GetMapping("/{id}")
	public Libro editarLibro(@PathVariable int id) {
		return servicioLibro.editarLibro(id);				
	}
	
	@DeleteMapping("/{id}")
	public void eliminarLibro(@PathVariable int id) {
		servicioLibro.eliminarLibro(id);
		
	}
	
}

