package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ista.string.BACKEND_FIBADI.Dao.IHistorialDao;
import com.ista.string.BACKEND_FIBADI.Model.Bien;
import com.ista.string.BACKEND_FIBADI.Model.Historial;
import com.ista.string.BACKEND_FIBADI.Model.Usuario;

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
	 @Override
	    public void saveInHistorial(Bien bien, Usuario usuario, String detalles, Date fecha) {
	        Historial historial = new Historial();
	        historial.setBien(bien);
	        historial.setUsuario(usuario);
	        historial.setHis_detalles(detalles);
	        historial.setHis_fecha(fecha);
	        historialDao.save(historial); // Aquí se guarda el registro en el Historial
	    }
	 
	//Implement
	 @Override
     public List<Historial> findByUsuario(Usuario usuario) {
	// TODO Auto-generated method stub
	return historialDao.findByUsuario(usuario);
}

}
