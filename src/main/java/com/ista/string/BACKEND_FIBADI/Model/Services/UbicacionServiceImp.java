package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.string.BACKEND_FIBADI.Dao.IUbicacionDao;
import com.ista.string.BACKEND_FIBADI.Model.Ubicacion;

@Service
public class UbicacionServiceImp implements IUbicacionService{

	@Autowired
	private IUbicacionDao ubicacionDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Ubicacion> ListAll() {
		return (List<Ubicacion>) ubicacionDao.findAll();

	}

	@Override
	@Transactional
	public Ubicacion saveUbicacion(Ubicacion ubicacion) {
		return ubicacionDao.save(ubicacion);

	}

	@Override
	@Transactional(readOnly = true)
	public Ubicacion findUbicacionById(Long id_ubi) {
		return ubicacionDao.findById(id_ubi).orElse(new Ubicacion());
	}

	@Override
	@Transactional
	public void DeleteUbicacionById(Long id_ubi) {
		ubicacionDao.deleteById(id_ubi);
	}
	
}
