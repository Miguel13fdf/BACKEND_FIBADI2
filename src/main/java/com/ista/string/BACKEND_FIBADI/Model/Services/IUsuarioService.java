package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ista.string.BACKEND_FIBADI.Model.Usuario;

public interface IUsuarioService extends UserDetailsService {

	public List<Usuario> ListAll();
	
	public Usuario saveUsuario(Usuario usuario);
	
	public Usuario savePerson(Usuario usuario);
	
	public Usuario findUsuarioById(Long id_usu);
		
	public Usuario findUsuarioByCriterio(String criterio);
	public  List<Usuario>findByUsuarioAndContrasenia(String usuario,String contrasenia );
	public List<Usuario> findUsuariosWithPersonaAndRolByUsuarioAndContrasenia(String usuario, String contrasenia);
}
