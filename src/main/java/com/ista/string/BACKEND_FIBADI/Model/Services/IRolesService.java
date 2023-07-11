package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import com.ista.string.BACKEND_FIBADI.Model.Roles;

public interface IRolesService {

	public List<Roles> ListAll();
	
	public Roles saveRoles(Roles roles);
	
	public Roles findRolesById(Long id_rol);
	
	public void DeleteRolesById(Long id_rol);
}
