package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import com.ista.string.BACKEND_FIBADI.Model.Historial;

public interface IHistorialService {

	public List<Historial> ListAll();
	
	public Historial saveHistorial(Historial historial);
	
	public Historial findHistorialById(Long id_his);
	
	public void DeleteHistorialById(Long id_his);
	
}
