package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import com.ista.string.BACKEND_FIBADI.Model.Rol;

public interface IRolService {

	public List<Rol> ListAll();
	
	public Rol saveRol(Rol rol);
	
	public Rol findRolById(Long rol_cod);
	
}
