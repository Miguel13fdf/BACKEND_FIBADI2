package com.ista.string.BACKEND_FIBADI.Model.Services;


import java.util.List;

import com.ista.string.BACKEND_FIBADI.Model.Bien;



public interface IBienServices {
	
	public List<Bien> findAll();
	
	public Bien Save (Bien bien);
	
	public Bien findById(Long bien_cod);
	
	public void delete(Long bien_cod);
	
	public List<Bien> findBienByCedulaCustodio(String cedula);
	
	public List<Bien> findBienByCategoria(String categoria);
	
	List<Bien> getBienesPorUsuarioYContrasenia(String usuario, String contrasenia);

	public List<Bien> findBienesByArgument(String argument);
	public List<Bien> findBienesByArgument2(String argument2);
	
	 Bien findByCodigoBarras(String codigoBarras);
	 
	 
	 public void actualizarFechaenBienes(int intervalo);
		public List<Bien> findBienesFechDesc ();
}
