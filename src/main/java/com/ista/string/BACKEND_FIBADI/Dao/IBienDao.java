package com.ista.string.BACKEND_FIBADI.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ista.string.BACKEND_FIBADI.Model.Bien;

public interface IBienDao extends CrudRepository<Bien, Long>{
	   @Query("SELECT b FROM Bien b WHERE b.usuario.usuario = :usuario AND b.usuario.contrasenia = :contrasenia")
	    List<Bien> findByUsuarioAndContrasenia(String usuario, String contrasenia);

}
