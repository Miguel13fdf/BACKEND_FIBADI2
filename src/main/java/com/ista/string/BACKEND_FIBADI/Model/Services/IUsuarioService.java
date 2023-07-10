package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;
import com.ista.string.BACKEND_FIBADI.Model.Usuario;

public interface IUsuarioService {

	public List<Usuario> ListAll();
	
	public Usuario saveUsuario(Usuario usuario);
	
	public Usuario findUsuarioById(Long id_usu);
		
	public List<Usuario> findUsuarioByCriterio(String criterio);
}
