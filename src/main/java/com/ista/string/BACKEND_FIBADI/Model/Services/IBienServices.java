package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import com.ista.string.BACKEND_FIBADI.Model.Bien;


public interface IBienServices {
	
	public List<Bien> findAll();
	
	public Bien Save (Bien bien);
	
	public Bien findById(Long bien_cod);
	
	public void delete(Long bien_cod);
	
	public Bien findBienByCedulaCustodio(String cedula);
	
	public Bien findBienByCategoria(String categoria);
	 List<Bien> getBienesPorUsuarioYContrasenia(String usuario, String contrasenia);

}
