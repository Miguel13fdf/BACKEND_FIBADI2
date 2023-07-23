package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.string.BACKEND_FIBADI.Dao.IBienDao;
import com.ista.string.BACKEND_FIBADI.Model.Bien;
import com.ista.string.BACKEND_FIBADI.Model.Usuario;
import com.ista.string.BACKEND_FIBADI.Model.Historial;

@Service
public class BienServicesImpl implements IBienServices {
	
	@Autowired
	private IBienDao BienDao;

	@Override
	@Transactional(readOnly=true)
	public List<Bien> findAll() {
		return (List<Bien>) BienDao.findAll();
	}

	@Override
	public Bien Save(Bien bien) {
		return BienDao.save(bien);
	}

	@Override
	@Transactional(readOnly=true)
	public Bien findById(Long bien_cod) {
		return BienDao.findById(bien_cod).orElse(null);
	}

	@Override
	public void delete(Long bien_cod) {
		BienDao.deleteById(bien_cod);
		
	}
	
	@Override
    public List<Bien> getBienesPorUsuarioYContrasenia(String usuario, String contrasenia) {
        return BienDao.findByUsuarioAndContrasenia(usuario, contrasenia);
    }

	@Override
	@Transactional(readOnly=true)
	public List<Bien> findBienByCedulaCustodio(String cedula) {
		return BienDao.findBienByCedulaCustodio(cedula);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Bien> findBienByCategoria(String categoria) {
		return BienDao.findBienByCategoria(categoria);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Bien> findBienesByArgument(String argument) {
		return BienDao.findBienesByArgument(argument);
	}
	  
}
