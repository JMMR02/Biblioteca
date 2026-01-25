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

import com.jmmr.biblioteca.modelo.entidad.Autor;
import com.jmmr.biblioteca.servicio.IAutorServicio;

@RestController
@RequestMapping("/api/autor")
public class AutorControlador {

	@Autowired
	private IAutorServicio servicioAutor;
	
	@GetMapping
	public List <Autor> listarAutor(){
		return servicioAutor.listarAutor();
	}
	
	@PostMapping
	public Autor crearCurso(@RequestBody Autor autor) {
		return servicioAutor.insertarAutor(autor);		
	}	
	
	@GetMapping("/{id}")
	public Autor editarAutor(@PathVariable int id) {
		return servicioAutor.editarAutor(id);				
	}
	
	@DeleteMapping("/{id}")
	public void eliminarAutor(@PathVariable int id) {
		servicioAutor.eliminarAutor(id);
		
	}
	
}

