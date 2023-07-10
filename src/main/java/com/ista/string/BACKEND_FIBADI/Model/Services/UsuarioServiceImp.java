package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ista.string.BACKEND_FIBADI.Dao.IUsuarioDao;
import com.ista.string.BACKEND_FIBADI.Model.Usuario;

@Service
public class UsuarioServiceImp implements IUsuarioService{

	@Autowired
	private IUsuarioDao UsuarioDao;

	@Override
	@Transactional (readOnly = true)
	public List<Usuario> ListAll() {
		return (List<Usuario>) UsuarioDao.findAll();
	}

	@Override
	@Transactional
	public Usuario saveUsuario(Usuario usuario) {
		return UsuarioDao.save(usuario);
	}

	@Override
	@Transactional (readOnly = true)
	public Usuario findUsuarioById(Long id_usu) {
		return UsuarioDao.findById(id_usu).orElse(new Usuario());
	}

	@Override
	@Transactional (readOnly = true)
	public List<Usuario> findUsuarioByCriterio(String criterio) {
		return UsuarioDao.findAdministradoresByCriterio(criterio);
	}
	

}
