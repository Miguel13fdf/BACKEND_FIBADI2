package com.ista.string.BACKEND_FIBADI.Dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.ista.string.BACKEND_FIBADI.Model.Administrador;
import java.util.List;
import org.springframework.data.repository.query.Param;
public interface IAdministradorDao extends CrudRepository<Administrador, Long> {


    @Query("SELECT a FROM Administrador a WHERE a.adm_usuario LIKE %:criterio%")
    List<Administrador> findAdministradoresByCriteria(@Param("criterio") String criterio);

}