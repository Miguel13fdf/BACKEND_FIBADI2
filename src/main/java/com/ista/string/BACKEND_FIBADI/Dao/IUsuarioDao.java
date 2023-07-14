package com.ista.string.BACKEND_FIBADI.Dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.ista.string.BACKEND_FIBADI.Model.Usuario;
import java.util.List;
import org.springframework.data.repository.query.Param;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

	@Query(value = "SELECT * FROM usuarios WHERE usuario LIKE %:criterio%", nativeQuery = true)
    Usuario findAdministradoresByCriterio(@Param("criterio") String criterio);
	@Query(value = "SELECT * FROM usuarios WHERE usuario LIKE %:usuario% AND contrasenia LIKE %:contrasenia%", nativeQuery = true)
	 List<Usuario>findByUsuarioAndContrasenia(@Param("usuario")String usuario,@Param("contrasenia")String contrasenia );
	@Query(value = "SELECT u, p, r FROM Usuario u JOIN u.persona p JOIN u.roles r WHERE u.usuario LIKE %:usuario% AND u.contrasenia LIKE %:contrasenia%")
	List<Usuario> findUsuariosWithPersonaAndRolByUsuarioAndContrasenia(@Param("usuario") String usuario, @Param("contrasenia") String contrasenia);

}