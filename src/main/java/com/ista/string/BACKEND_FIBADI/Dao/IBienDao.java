package com.ista.string.BACKEND_FIBADI.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ista.string.BACKEND_FIBADI.Model.Bien;

public interface IBienDao extends CrudRepository<Bien, Long>{
	
	@Query("SELECT b FROM Bien b WHERE b.usuario.usuario = :usuario AND b.usuario.contrasenia = :contrasenia")
    List<Bien> findByUsuarioAndContrasenia(String usuario, String contrasenia);

	@Query(value = "SELECT * FROM BIENES b INNER JOIN USUARIOS u ON (b.bien_user_cod = u.usu_cod) INNER JOIN PERSONA p\r\n"
			+ "ON (u.usu_per_cod = p.per_cod) WHERE p.per_cedula LIKE %:cedula%", nativeQuery = true)
	List<Bien> findBienByCedulaCustodio(@Param("cedula") String cedula);
	
	@Query(value = "SELECT * FROM BIENES b INNER JOIN CATEGORIA c ON (b.bien_cat_cod = c.cat_cod) WHERE c.cat_nombre LIKE %:categoria%"
			, nativeQuery = true)
	List<Bien> findBienByCategoria(@Param("categoria") String categoria);
	
	@Query(value = "SELECT * FROM BIENES b INNER JOIN UBICACIONES u ON (b.bien_edi_cod = u.ubi_cod) \r\n"
			+ "	INNER JOIN CATEGORIA c ON (b.bien_cat_cod = c.cat_cod)\r\n "
			+ "WHERE u.ubi_nombre LIKE %:argument% OR c.cat_nombre LIKE %:argument%", nativeQuery = true)
	List<Bien> findBienesByArgument(@Param("argument") String argument);
}
