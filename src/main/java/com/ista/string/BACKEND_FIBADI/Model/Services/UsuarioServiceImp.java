package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ista.string.BACKEND_FIBADI.Dao.IUsuarioDao;
import com.ista.string.BACKEND_FIBADI.Model.Persona;
import com.ista.string.BACKEND_FIBADI.Model.Usuario;

@Service
public class UsuarioServiceImp implements IUsuarioService{

	@Autowired
	private IUsuarioDao UsuarioDao;
	
	private BCryptPasswordEncoder passwordEconder;

	@Override
	@Transactional (readOnly = true)
	public List<Usuario> ListAll() {
		return (List<Usuario>) UsuarioDao.findAll();
	}

	@Override
	@Transactional
	public Usuario saveUsuario(Usuario usuario) {
		usuario.setUsu_contrasenia(passwordEconder.encode(usuario.getUsu_contrasenia()));
		return UsuarioDao.save(usuario);
	}

	@Override
	@Transactional (readOnly = true)
	public Usuario findUsuarioById(Long id_usu) {
		return UsuarioDao.findById(id_usu).orElse(new Usuario());
	}

	@Override
	@Transactional (readOnly = true)
	public Usuario findUsuarioByCriterio(String criterio) {
		return UsuarioDao.findAdministradoresByCriterio(criterio);
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario persona = UsuarioDao.findAdministradoresByCriterio(username);
		if(persona == null) {
			throw new UsernameNotFoundException("Usuario no válido");
		}
		
		return new User(persona.getUsu_usuario(), persona.getUsu_contrasenia(), null); //usuario, contraseña, rol
	}
}
