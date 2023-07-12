package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import com.ista.string.BACKEND_FIBADI.Model.Categoria;

public interface ICategoriaService {

   public List<Categoria> findAll();
	
	public Categoria saveCategoria(Categoria categoria);
	
	public Categoria findCategoriaById(Long cat_cod);
}
