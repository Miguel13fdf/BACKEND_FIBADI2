package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.string.BACKEND_FIBADI.Dao.IPropietarioDao;
import com.ista.string.BACKEND_FIBADI.Model.Propietario;

@Service
public class PropietarioServiceImp implements IPropietarioService{

	@Autowired
	private IPropietarioDao propietarioDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Propietario> ListAll() {
		return (List<Propietario>) propietarioDao.findAll();
	}

	@Override
	@Transactional
	public Propietario savePropietario(Propietario propietario) {
		return propietarioDao.save(propietario);
	}

	@Override
	@Transactional(readOnly = true)
	public Propietario findPropietarioById(Long id_pro) {
		return propietarioDao.findById(id_pro).orElse(new Propietario());
	}

	@Override
	@Transactional
	public void DeletePropietarioById(Long id_pro) {
		propietarioDao.deleteById(id_pro);
	}

}
