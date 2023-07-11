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

import com.ista.string.BACKEND_FIBADI.Model.Roles;
import com.ista.string.BACKEND_FIBADI.Model.Services.IRolesService;

@RestController
@RequestMapping ("/tecazuay")
public class RolesRestController {

	@Autowired
	private IRolesService rolesService;
	
	@GetMapping ("/roles")
	public List<Roles> index() {
		return rolesService.ListAll();
	}
	
	@GetMapping ("/roles/{id}")
	public Roles findRolesById(@PathVariable("id") Long id_rol) {
		return rolesService.findRolesById(id_rol);
	}
	
	@PostMapping ("/roles")
	@ResponseStatus (HttpStatus.CREATED)
	public Roles createRoles(@RequestBody Roles roles) {
		return rolesService.saveRoles(roles);
	}
	
	@PutMapping ("/roles/{id}")
	public Roles updateRoles(@RequestBody Roles roles, @PathVariable("id") Long id_rol) {
		Roles rolesActual = rolesService.findRolesById(id_rol);
		rolesActual.setRol_nombre(roles.getRol_nombre());
		rolesActual.setRol_estado(roles.getRol_estado());
		return  rolesService.saveRoles(rolesActual);
	}
	
	
	@DeleteMapping ("/roles/{id}")
	@ResponseStatus (HttpStatus.NO_CONTENT)
	public void deleteRoles(@PathVariable("id") Long id_rol) {
		rolesService.DeleteRolesById(id_rol);
	}
}
