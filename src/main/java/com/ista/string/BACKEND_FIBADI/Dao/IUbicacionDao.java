package com.ista.string.BACKEND_FIBADI.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.ista.string.BACKEND_FIBADI.Model.Ubicacion;

public interface IUbicacionDao extends CrudRepository<Ubicacion, Long> {
	 List<Ubicacion> findByDepartamentoContaining(String departamento);
}
