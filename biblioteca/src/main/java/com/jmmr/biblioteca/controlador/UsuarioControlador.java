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

import com.jmmr.biblioteca.modelo.entidad.Usuario;
import com.jmmr.biblioteca.servicio.IUsuarioServicio;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioControlador {

	@Autowired
	private IUsuarioServicio servicioUsuario;
	
	@GetMapping
	public List <Usuario> listarUsuario(){
		return servicioUsuario.listarUsuario();
	}
	
	@PostMapping
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		return servicioUsuario.insertarUsuario(usuario);		
	}	
	
	@GetMapping("/{id}")
	public Usuario editarUsuario(@PathVariable int id) {
		return servicioUsuario.editarUsuario(id);				
	}
	
	@DeleteMapping("/{id}")
	public void eliminarUsuario(@PathVariable int id) {
		servicioUsuario.eliminarUsuario(id);
		
	}
	
}

