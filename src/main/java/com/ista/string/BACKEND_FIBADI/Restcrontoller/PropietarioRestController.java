package com.ista.string.BACKEND_FIBADI.Restcrontoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ista.string.BACKEND_FIBADI.Model.Propietario;
import com.ista.string.BACKEND_FIBADI.Model.Services.IPropietarioService;

@RestController
@RequestMapping ("/tecazuay")
public class PropietarioRestController {

	@Autowired
	private IPropietarioService propietarioService;
	
	@GetMapping ("/propietarios")
	public List<Propietario> index() {
		return propietarioService.ListAll();
	}
	
	@GetMapping ("/propietarios/{id}")
	public Propietario findPropietarioById(@PathVariable("id") Long id_pro) {
		return propietarioService.findPropietarioById(id_pro);
	}
	
	@PostMapping ("/propietarios")
	@ResponseStatus (HttpStatus.CREATED)
	public Propietario createPropietario(@RequestBody Propietario propietario) {
		return propietarioService.savePropietario(propietario);
	}
	
	@PutMapping ("/propietarios/{id}")
	public Propietario updatePropietario(@RequestBody Propietario propietario, @PathVariable("id") Long id_pro) {
		Propietario propietarioActual = propietarioService.findPropietarioById(id_pro);
		propietarioActual.setPro_nombre(propietario.getPro_nombre());
		propietarioActual.setPro_direccion(propietario.getPro_direccion());
		propietarioActual.setPro_telefono(propietario.getPro_telefono());
		propietarioActual.setPro_estado(propietario.getPro_estado());
		return  propietarioService.savePropietario(propietarioActual);
	}
	
	
	@DeleteMapping ("/propietarios/{id}")
	@ResponseStatus (HttpStatus.NO_CONTENT)
	public void deletePropietario(@PathVariable("id") Long id_pro) {
		propietarioService.DeletePropietarioById(id_pro);
	}
}
