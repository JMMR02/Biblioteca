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

import com.jmmr.biblioteca.modelo.entidad.Categoria;
import com.jmmr.biblioteca.servicio.ICategoriaServicio;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaControlador {

	@Autowired
	private ICategoriaServicio servicioCategoria;
	
	@GetMapping
	public List <Categoria> listarCategoria(){
		return servicioCategoria.listarCategoria();
	}
	
	@PostMapping
	public Categoria crearCategoria(@RequestBody Categoria categoria) {
		return servicioCategoria.insertarCategoria(categoria);		
	}	
	
	@GetMapping("/{id}")
	public Categoria editarCategoria(@PathVariable int id) {
		return servicioCategoria.editarCategoria(id);				
	}
	
	@DeleteMapping("/{id}")
	public void eliminarCategoria(@PathVariable int id) {
		servicioCategoria.eliminarCategoria(id);
		
	}
	
}

