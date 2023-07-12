package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ista.string.BACKEND_FIBADI.Dao.IUsuarioDao;
import com.ista.string.BACKEND_FIBADI.Model.Persona;
import com.ista.string.BACKEND_FIBADI.Model.Rol;
import com.ista.string.BACKEND_FIBADI.Model.Usuario;

@Service
public class UsuarioServiceImp implements IUsuarioService {

    @Autowired
    private IUsuarioDao usuarioDao;

    @Autowired
   // private BCryptPasswordEncoder passwordEncoder;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> ListAll() {
        return (List<Usuario>) usuarioDao.findAll();
    }

    @Override
    @Transactional
    public Usuario saveUsuario(Usuario usuario) {
        usuario.setContrasenia(usuario.getContrasenia());

        // Asignar el rol "admin" al usuario
        Rol rolAdmin = new Rol();
        //rolAdmin.setRol_nombre("admin");

        usuario.setRoles(Collections.singletonList(rolAdmin));

        // Establecer el estado del usuario como true
        usuario.setUsu_estado(true);

        return usuarioDao.save(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario findUsuarioById(Long id_usu) {
        return usuarioDao.findById(id_usu).orElse(new Usuario());
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario findUsuarioByCriterio(String criterio) {
        return usuarioDao.findAdministradoresByCriterio(criterio);
    }

 

	@Override
	 @Transactional(readOnly = true)
	public List<Usuario> findByUsuarioAndContrasenia(String usuario, String contrasenia) {
		// TODO Auto-generated method stub
		return  usuarioDao.findByUsuarioAndContrasenia(usuario, contrasenia);
	}

	


}

