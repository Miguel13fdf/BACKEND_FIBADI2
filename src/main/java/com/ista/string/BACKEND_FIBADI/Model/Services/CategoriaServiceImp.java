package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.string.BACKEND_FIBADI.Dao.ICategoriaDao;
import com.ista.string.BACKEND_FIBADI.Dao.ICustodioDao;
import com.ista.string.BACKEND_FIBADI.Model.Categoria;
import com.ista.string.BACKEND_FIBADI.Model.Custodio;

@Service
public class CategoriaServiceImp implements ICategoriaService{
	
@Autowired
	
	private ICategoriaDao CategoriaDao;

	@Override
	@Transactional(readOnly=true)
	
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return (List<Categoria>) CategoriaDao.findAll();
	}

	@Override
	public Categoria saveCategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		return CategoriaDao.save(categoria);
	}

	@Override
	public Categoria findCategoriaById(Long cat_cod) {
		// TODO Auto-generated method stub
		return CategoriaDao.findById(cat_cod).orElse(null);
	}

}
