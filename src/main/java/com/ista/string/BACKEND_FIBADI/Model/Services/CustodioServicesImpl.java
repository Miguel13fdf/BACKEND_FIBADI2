package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.string.BACKEND_FIBADI.Dao.ICustodioDao;
import com.ista.string.BACKEND_FIBADI.Model.Custodio;


@Service

public class CustodioServicesImpl implements ICustodioServices{
	
	@Autowired
	
	private ICustodioDao CustodioDao;

	@Override
	@Transactional(readOnly=true)
	
	public List<Custodio> findAll() {
		// TODO Auto-generated method stub
		return (List<Custodio>) CustodioDao.findAll();
	}

	@Override
	public Custodio Save(Custodio custodio) {
		// TODO Auto-generated method stub
		return CustodioDao.save(custodio);
	}

	@Override
	public Custodio findById(Long cus_cod) {
		// TODO Auto-generated method stub
		return CustodioDao.findById(cus_cod).orElse(null);
	}

	@Override
	public void delete(Long cus_cod) {
		// TODO Auto-generated method stub
		CustodioDao.deleteById(cus_cod);
		
	}
	

	
	

}
