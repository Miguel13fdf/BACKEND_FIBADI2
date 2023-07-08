package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ista.string.BACKEND_FIBADI.Dao.IHistorialDao;
import com.ista.string.BACKEND_FIBADI.Model.Historial;

@Service
public class HistorialServiceImp implements IHistorialService {

	@Autowired
	private IHistorialDao historialDao;
	
	@Override
	public List<Historial> ListAll() {
		return (List<Historial>) historialDao.findAll();
	}

	@Override
	public Historial saveHistorial(Historial historial) {
		return historialDao.save(historial);
	}

	@Override
	public Historial findHistorialById(Long id_his) {
		return historialDao.findById(id_his).orElse(new Historial());
	}

	@Override
	public void DeleteHistorialById(Long id_his) {
		historialDao.deleteById(id_his);
	}

}
