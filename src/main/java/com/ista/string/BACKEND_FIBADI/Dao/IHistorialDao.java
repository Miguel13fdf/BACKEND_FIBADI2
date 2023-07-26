package com.ista.string.BACKEND_FIBADI.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.ista.string.BACKEND_FIBADI.Model.Historial;
import com.ista.string.BACKEND_FIBADI.Model.Usuario;

public interface IHistorialDao extends CrudRepository<Historial, Long> {
	List<Historial> findByUsuario(Usuario usuario);

}
