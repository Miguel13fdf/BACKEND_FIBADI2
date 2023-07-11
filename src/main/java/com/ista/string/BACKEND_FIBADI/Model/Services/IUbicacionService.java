package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import com.ista.string.BACKEND_FIBADI.Model.Ubicacion;

public interface IUbicacionService {

	public List<Ubicacion> ListAll();
	
	public Ubicacion saveUbicacion(Ubicacion ubicacion);
	
	public Ubicacion findUbicacionById(Long id_ubi);
	
	public void DeleteUbicacionlById(Long id_ubi);
}
