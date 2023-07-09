package com.ista.string.BACKEND_FIBADI.Dao;


import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.ista.string.BACKEND_FIBADI.Model.Categoria;

public interface ICategoriaRepository extends CrudRepository<Categoria, Integer>{
	
	/*@Query("SELECT c FROM Categoria_c WHERE c.vigencia = 1")
	Iterable<Categoria> listarCategoriasActivas();
*/
}
