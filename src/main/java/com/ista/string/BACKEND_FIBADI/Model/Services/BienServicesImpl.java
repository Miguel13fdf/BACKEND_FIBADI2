package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.string.BACKEND_FIBADI.Dao.IBienDao;
import com.ista.string.BACKEND_FIBADI.Model.Bien;


@Service

public class BienServicesImpl implements IBienServices {
	
	@Autowired
	private IBienDao BienDao;

	@Override
	@Transactional(readOnly=true)
	
	public List<Bien> findAll() {
		// TODO Auto-generated method stub
		return (List<Bien>) BienDao.findAll();
	}

	@Override
	public Bien Save(Bien bien) {
		// TODO Auto-generated method stub
		return BienDao.save(bien);
	}

	@Override
	public Bien findById(Long bien_cod) {
		// TODO Auto-generated method stub
		return BienDao.findById(bien_cod).orElse(null);
	}

	@Override
	public void delete(Long bien_cod) {
		// TODO Auto-generated method stub
		BienDao.deleteById(bien_cod);
		
	}
	 @Override
	    public List<Bien> getBienesPorUsuarioYContrasenia(String usuario, String contrasenia) {
	        return BienDao.findByUsuarioAndContrasenia(usuario, contrasenia);
	        }

}
