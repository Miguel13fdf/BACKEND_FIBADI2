package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.string.BACKEND_FIBADI.Dao.IAdministradorDao;
import com.ista.string.BACKEND_FIBADI.Model.Administrador;

@Service

public class AdministradorServiceImpl implements IAdministradorService {
	
	@Autowired
	private IAdministradorDao adminDao;

	@Override
	@Transactional(readOnly=true)
	
	public List<Administrador> findAll() {
		// TODO Auto-generated method stub
		return (List<Administrador>) adminDao.findAll();
	}

	@Override
	public Administrador SaveAdmin(Administrador administrador) {
		// TODO Auto-generated method stub
		return adminDao.save(administrador);
	}

	@Override
	public Administrador findAdminById(Long adm_cod) {
		// TODO Auto-generated method stub
		return adminDao.findById(adm_cod).orElse(null);
	}


}
