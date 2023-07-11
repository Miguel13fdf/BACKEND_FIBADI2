package com.ista.string.BACKEND_FIBADI.Restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.ista.string.BACKEND_FIBADI.Model.Rol;
import com.ista.string.BACKEND_FIBADI.Model.Services.IRolService;

@RestController
@RequestMapping ("/tecazuay")
public class RolRestController {

	@Autowired
	private IRolService rolService;
	
	@GetMapping ("/roles")
	public List<Rol> index() {
		return rolService.ListAll();
	}
	
	@GetMapping ("/roles/{id}")
	public Rol findRolById(@PathVariable("id") Long cod_rol) {
		return rolService.findRolById(cod_rol);
	}
	
	@PostMapping ("/roles")
	@ResponseStatus (HttpStatus.CREATED)
	public Rol createRol(@RequestBody Rol rol) {
		return rolService.saveRol(rol);
	}
	
	@PutMapping ("/roles/{id}")
	public Rol updateRol(@RequestBody Rol rol, @PathVariable("id") Long cod_rol) {
		Rol rolActual = rolService.findRolById(cod_rol);
		rolActual.setRol_nombre(rol.getRol_nombre());
		rolActual.setRol_estado(rol.getRol_estado());
		return  rolService.saveRol(rolActual);
	}

}
