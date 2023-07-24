package com.ista.string.BACKEND_FIBADI.Restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ista.string.BACKEND_FIBADI.Model.Historial;
import com.ista.string.BACKEND_FIBADI.Model.Ubicacion;
import com.ista.string.BACKEND_FIBADI.Model.Services.IHistorialService;
import com.ista.string.BACKEND_FIBADI.Model.Services.IUbicacionService;


@CrossOrigin(origins = {"http://localhost:4200", "http://192.168.20.176:4200"})
@RestController
@RequestMapping ("/tecazuay")
public class UbicacionRestController {

	@Autowired
	private IUbicacionService ubicacionService;
	
	@GetMapping ("/ubicacion")
	public List<Ubicacion> index() {
		return ubicacionService.ListAll();
	}
	
	@GetMapping ("/ubicacion/{id}")
	public Ubicacion findUbicacionById(@PathVariable("id") Long id_ubi) {
		return ubicacionService.findUbicacionById(id_ubi);
	}
	
	@PostMapping ("/ubicacion")
	@ResponseStatus (HttpStatus.CREATED)
	public Ubicacion createUbicacion(@RequestBody Ubicacion ubicacion) {
		return ubicacionService.saveUbicacion(ubicacion);
	}
	
	@PutMapping ("/ubicacion/{id}")
	public Ubicacion updateUbicacion(@RequestBody Ubicacion ubicacion, @PathVariable("id") Long id_ubi) {
		Ubicacion ubicacionActual = ubicacionService.findUbicacionById(id_ubi);
		ubicacionActual.setDepartamento(ubicacion.getDepartamento());
		ubicacionActual.setUbi_nombre(ubicacion.getUbi_nombre());
		ubicacionActual.setUbi_estado(ubicacion.getUbi_estado());		
		return  ubicacionService.saveUbicacion(ubicacionActual);
	}
	
	
	@DeleteMapping ("/ubicacion/{id}")
	@ResponseStatus (HttpStatus.NO_CONTENT)
	public void deleteUbicacion(@PathVariable("id") Long id_ubi) {
		ubicacionService.DeleteUbicacionlById(id_ubi);
	}
	  @GetMapping("/ubicacion/departamento")
	    public List<Ubicacion> findUbicacionesByDepartamento(@RequestParam("departamento") String departamento) {
	        return ubicacionService.findByDepartamentoContaining(departamento);
	    }
	
	
}
