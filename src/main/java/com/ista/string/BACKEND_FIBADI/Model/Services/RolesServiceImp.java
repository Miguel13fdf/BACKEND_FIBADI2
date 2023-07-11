package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ista.string.BACKEND_FIBADI.Dao.IRolesDao;
import com.ista.string.BACKEND_FIBADI.Model.Roles;
public class RolesServiceImp implements IRolesService{

	@Autowired
	private IRolesDao rolesDao;

	@Override
	@Transactional(readOnly = true)
	public List<Roles> ListAll() {
		return (List<Roles>) rolesDao.findAll();
	}

	@Override
	@Transactional
	public Roles saveRoles(Roles roles) {
		return rolesDao.save(roles);
	}

	@Override
	@Transactional(readOnly = true)
	public Roles findRolesById(Long id_rol) {
		return rolesDao.findById(id_rol).orElse(new Roles());
	}

	@Override
	@Transactional
	public void DeleteRolesById(Long id_rol) {
		rolesDao.deleteById(id_rol);

	}

}
