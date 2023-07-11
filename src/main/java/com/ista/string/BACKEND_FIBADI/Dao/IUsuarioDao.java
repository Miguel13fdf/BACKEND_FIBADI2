package com.ista.string.BACKEND_FIBADI.Dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.ista.string.BACKEND_FIBADI.Model.Usuario;
import java.util.List;
import org.springframework.data.repository.query.Param;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

	@Query(value = "SELECT * FROM Usuario WHERE usu_usuario LIKE %:criterio%", nativeQuery = true)
    Usuario findAdministradoresByCriterio(@Param("criterio") String criterio);

}