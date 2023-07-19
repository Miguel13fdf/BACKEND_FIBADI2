package com.ista.string.BACKEND_FIBADI.Dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ista.string.BACKEND_FIBADI.Model.Bien;

public interface IBienDao extends CrudRepository<Bien, Long>{

	@Query(value = "SELECT * FROM BIENES b INNER JOIN USUARIOS u ON (b.bien_user_cod = u.usu_cod) INNER JOIN PERSONA p\r\n"
			+ "ON (u.usu_per_cod = p.per_cod) WHERE p.per_cedula LIKE %:cedula%", nativeQuery = true)
	Bien findBienByCedulaCustodio(@Param("cedula") String cedula);
	
	@Query(value = "SELECT * FROM BIENES b INNER JOIN CATEGORIA c ON (b.bien_cat_cod = c.cat_cod) WHERE c.cat_nombre LIKE %:categoria%"
			, nativeQuery = true)
	Bien findBienByCategoria(@Param("categoria") String categoria);
}
