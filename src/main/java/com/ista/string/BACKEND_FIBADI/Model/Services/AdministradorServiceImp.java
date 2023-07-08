package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ista.string.BACKEND_FIBADI.Dao.IAdministradorDao;
import com.ista.string.BACKEND_FIBADI.Model.Administrador;

@Service
public class AdministradorServiceImp implements IAdministradorService{

	@Autowired
	private IAdministradorDao adminDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Administrador> ListAll() {
		return (List<Administrador>) adminDao.findAll();	
	}

	@Override
	@Transactional
	public Administrador saveAdministrador(Administrador administrador) {
		return adminDao.save(administrador);
	}

	@Override
	@Transactional (readOnly = true)
	public Administrador findAdministradorById(Long id_adm) {
		return adminDao.findById(id_adm).orElse(new Administrador());
	}

	@Override
	@Transactional
	public void DeleteAdministradorById(Long id_adm) {
		adminDao.deleteById(id_adm);		
	}
	
	  @Override
	    @Transactional(readOnly = true)
	    public List<Administrador> findAdministradoresByCriteria(String criterio) {
	        return adminDao.findAdministradoresByCriteria(criterio);
	    }
}
