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

import com.jmmr.biblioteca.modelo.entidad.Prestamo;
import com.jmmr.biblioteca.servicio.IPrestamoServicio;

@RestController
@RequestMapping("/api/prestamo")
public class PrestamoControlador {

	@Autowired
	private IPrestamoServicio servicioPrestamo;
	
	@GetMapping
	public List <Prestamo> listarPrestamo(){
		return servicioPrestamo.listarPrestamo();
	}
	
	@PostMapping
	public Prestamo crearPrestamo(@RequestBody Prestamo prestamo) {
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

