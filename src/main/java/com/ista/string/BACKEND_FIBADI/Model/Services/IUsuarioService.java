package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ista.string.BACKEND_FIBADI.Model.Usuario;

public interface IUsuarioService extends UserDetailsService {

	public List<Usuario> ListAll();
	
	public Usuario saveUsuario(Usuario usuario);
	
	public Usuario findUsuarioById(Long id_usu);
		
	public Usuario findUsuarioByCriterio(String criterio);
}
