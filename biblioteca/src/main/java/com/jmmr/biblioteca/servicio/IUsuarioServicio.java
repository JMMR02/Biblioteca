package com.jmmr.biblioteca.servicio;

import java.util.List;

import com.jmmr.biblioteca.modelo.entidad.Usuario;

public interface IUsuarioServicio {
	
	public Usuario insertarUsuario(Usuario nuevoUsuario);
	public Usuario editarUsuario(int idUsuario);
	public void eliminarUsuario(int idUsuario);
	public List<Usuario> listarUsuario(); 	
			
}