package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import com.ista.string.BACKEND_FIBADI.Model.Propietario;

public interface IPropietarioService {

	public List<Propietario> ListAll();
	
	public Propietario savePropietario(Propietario propietario);
	
	public Propietario findPropietarioById(Long id_pro);
	
	public void DeletePropietarioById(Long id_pro);
}
