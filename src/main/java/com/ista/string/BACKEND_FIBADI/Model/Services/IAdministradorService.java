package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;
import com.ista.string.BACKEND_FIBADI.Model.Administrador;

public interface IAdministradorService {

	public List<Administrador> ListAll();
	
	public Administrador saveAdministrador(Administrador administrador);
	
	public Administrador findAdministradorById(Long id_adm);
	
	public void DeleteAdministradorById(Long id_adm);
	 public List<Administrador> findAdministradoresByCriteria(String criterio);
}
