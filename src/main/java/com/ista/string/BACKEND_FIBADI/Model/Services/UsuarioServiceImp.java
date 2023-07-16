package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.string.BACKEND_FIBADI.Dao.IRolDao;
import com.ista.string.BACKEND_FIBADI.Dao.IUsuarioDao;
import com.ista.string.BACKEND_FIBADI.Model.Persona;
import com.ista.string.BACKEND_FIBADI.Model.Rol;
import com.ista.string.BACKEND_FIBADI.Model.Usuario;

@Service
public class UsuarioServiceImp implements IUsuarioService {

    @Autowired
    private IUsuarioDao usuarioDao;
    
    @Autowired
    private IPersonaService personaService;
    
    @Autowired
    private IRolDao rolDao;

    //@Autowired
   // private BCryptPasswordEncoder passwordEncoder;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> ListAll() {
        return (List<Usuario>) usuarioDao.findAll();
    }

    @Override
    @Transactional
    public Usuario saveUsuario(Usuario usuario) {

        /*// Asignar el rol "admin" al usuario
        Rol rolAdmin = new Rol();
        //rolAdmin.setRol_nombre("admin");

        usuario.setRoles(Collections.singletonList(rolAdmin));*/
    	System.out.println(usuario.getPersona());
        if (usuario != null && usuario.getPersona() != null) {
        	
        	System.out.println(usuario.getPersona());
            Persona personaRegistrada = personaService.savePersona(usuario.getPersona());
            usuario.setPersona(personaRegistrada);

            Long idRolDeseado = 2L; // ID del rol deseado
            Rol rolDeseado = rolDao.findById(idRolDeseado).orElse(null);

            if (rolDeseado != null) {
                // Asignar el rol deseado al usuario
                usuario.setRoles(Collections.singletonList(rolDeseado));
            }

            usuario.setUsu_estado(true); // Establecer el estado del usuario como true
            return usuarioDao.save(usuario);
        }
        
        return null;
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
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioDao.findAdministradoresByCriterio(username);
        if (usuario == null) {
            throw new UsernameNotFoundException("Usuario no válido");
        }

        // Obtener la colección de roles del usuario
        Collection<Rol> roles = usuario.getRoles();

        // Mapear los roles a una lista de autoridades
        List<GrantedAuthority> authorities = roles.stream()
                .map(rol -> new SimpleGrantedAuthority(rol.getRol_nombre()))
                .collect(Collectors.toList());

        return new User(usuario.getUsuario(), usuario.getContrasenia(), authorities);
    }

	@Override
	 @Transactional(readOnly = true)
	public List<Usuario> findByUsuarioAndContrasenia(String usuario, String contrasenia) {
		// TODO Auto-generated method stub
		return  usuarioDao.findByUsuarioAndContrasenia(usuario, contrasenia);
	}
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findUsuariosWithPersonaAndRolByUsuarioAndContrasenia(String usuario, String contrasenia) {
		return usuarioDao.findUsuariosWithPersonaAndRolByUsuarioAndContrasenia(usuario, contrasenia);
	}


}

