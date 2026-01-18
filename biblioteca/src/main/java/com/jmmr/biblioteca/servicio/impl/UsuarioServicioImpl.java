package com.jmmr.biblioteca.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jmmr.biblioteca.modelo.entidad.Usuario;
import com.jmmr.biblioteca.repositorio.IUsuarioRepositorio;
import com.jmmr.biblioteca.servicio.IUsuarioServicio;

@Service
@Component
public class UsuarioServicioImpl implements IUsuarioServicio{
	
	@Autowired
	public IUsuarioRepositorio repositorioUsuario;

	@Override
	public Usuario insertarUsuario(Usuario nuevoUsuario) {
		// TODO Auto-generated method stub
		return repositorioUsuario.save(nuevoUsuario);
	}

	@Override
	public Usuario editarUsuario(int idUsuario) {
		// TODO Auto-generated method stub
		return repositorioUsuario.findById(idUsuario).get();
	}

	@Override
	public void eliminarUsuario(int idUsuario) {
		// TODO Auto-generated method stub
		repositorioUsuario.delete(editarUsuario(idUsuario));
		
	}

	@Override
	public List<Usuario> listarUsuario() {
		// TODO Auto-generated method stub
		return repositorioUsuario.findAll();
	}
	
	
	

}
