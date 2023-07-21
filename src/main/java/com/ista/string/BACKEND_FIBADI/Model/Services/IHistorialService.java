package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.Date;
import java.util.List;

import com.ista.string.BACKEND_FIBADI.Model.Bien;
import com.ista.string.BACKEND_FIBADI.Model.Historial;
import com.ista.string.BACKEND_FIBADI.Model.Usuario;

public interface IHistorialService {

	public List<Historial> ListAll();
	
	public Historial saveHistorial(Historial historial);
	
	public Historial findHistorialById(Long id_his);
	
	public void DeleteHistorialById(Long id_his);
	 public void saveInHistorial(Bien bien, Usuario usuario, String detalles, Date fecha);
	
}
