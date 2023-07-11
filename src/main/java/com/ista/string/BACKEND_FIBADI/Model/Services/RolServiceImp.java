package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ista.string.BACKEND_FIBADI.Dao.IRolDao;
import com.ista.string.BACKEND_FIBADI.Model.Rol;

@Service
public class RolServiceImp implements IRolService {

	@Autowired
	private IRolDao rolDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Rol> ListAll() {
		return (List<Rol>) rolDao.findAll();
	}

	@Override
	@Transactional
	public Rol saveRol(Rol rol) {
		return rolDao.save(rol);
	}

	@Override
	@Transactional (readOnly = true)
	public Rol findRolById(Long rol_cod) {
		return rolDao.findById(rol_cod).orElse(new Rol());
	}

}
