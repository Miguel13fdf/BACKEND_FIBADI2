package com.ista.string.BACKEND_FIBADI.Restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.ista.string.BACKEND_FIBADI.Model.Historial;
import com.ista.string.BACKEND_FIBADI.Model.Services.IHistorialService;

@RestController
@RequestMapping ("/tecazuay")
public class HistorialRestController {

	@Autowired
	private IHistorialService historialService;
	
	@GetMapping ("/historial")
	public List<Historial> index() {
		return historialService.ListAll();
	}
	
	@GetMapping ("/historial/{id}")
	public Historial findHistorialById(@PathVariable("id") Long id_his) {
		return historialService.findHistorialById(id_his);
	}
	
	@PostMapping ("/historial")
	@ResponseStatus (HttpStatus.CREATED)
	public Historial createHistorial(@RequestBody Historial historial) {
		return historialService.saveHistorial(historial);
	}
	
	@PutMapping ("/historial/{id}")
	public Historial updateHistorial(@RequestBody Historial historial, @PathVariable("id") Long id_his) {
		Historial historialActual = historialService.findHistorialById(id_his);
		historialActual.setHis_fecha(historial.getHis_fecha());
		historialActual.setHis_detalles(historial.getHis_detalles());
		
		return  historialService.saveHistorial(historialActual);
	}
	
	/*
	@DeleteMapping ("/historial/{id}")
	@ResponseStatus (HttpStatus.NO_CONTENT)
	public void deleteHistorial(@PathVariable("id") Long id_his) {
		historialService.DeleteHistorialById(id_his);
	}*/
	
	
}
