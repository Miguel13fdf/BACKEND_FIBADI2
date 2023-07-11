package com.ista.string.BACKEND_FIBADI.Dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import org.springframework.data.repository.query.Param;

import com.ista.string.BACKEND_FIBADI.Model.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Long>  {
	@Query(value = "SELECT * FROM Persona WHERE per_cedula = :criterio OR per_email = :criterio", nativeQuery = true)
	Persona findPersonasByCriteria(@Param("criterio") String criterio);
}
