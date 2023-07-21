package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import com.ista.string.BACKEND_FIBADI.Model.Administrador;

public interface IAdministradorService {

	public List<Administrador> findAll();
	
	public Administrador SaveAdmin (Administrador administrador);
	
	public Administrador findAdminById(Long adm_cod);
}
