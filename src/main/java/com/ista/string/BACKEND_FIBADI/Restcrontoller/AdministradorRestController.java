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
import com.ista.string.BACKEND_FIBADI.Model.Administrador;
import com.ista.string.BACKEND_FIBADI.Model.Services.IAdministradorService;

@RestController
@RequestMapping ("/tecazuay")
public class AdministradorRestController {

	@Autowired
	private IAdministradorService adminService;
	
	@GetMapping ("/administradores")
	public List<Administrador> index() {
		return adminService.ListAll();
	}
	
	@GetMapping ("/administradores/{id}")
	public Administrador findAdminById(@PathVariable("id") Long id_adm) {
		return adminService.findAdministradorById(id_adm);
	}
	
	@PostMapping ("/administradores")
	@ResponseStatus (HttpStatus.CREATED)
	public Administrador createAdmin(@RequestBody Administrador administrador) {
		return adminService.saveAdministrador(administrador);
	}
	
	@PutMapping ("/administradores/{id}")
	public Administrador updateAdmin(@RequestBody Administrador administrador, @PathVariable("id") Long id_adm) {
		Administrador adminActual = adminService.findAdministradorById(id_adm);
		adminActual.setAdm_usuario(administrador.getAdm_usuario());
		adminActual.setAdm_contrasenia(administrador.getAdm_contrasenia());
		
		return  adminService.saveAdministrador(adminActual);
	}
	
	@DeleteMapping ("/administradores/{id}")
	@ResponseStatus (HttpStatus.NO_CONTENT)
	public void deleteAdmin(@PathVariable("id") Long id_adm) {
		adminService.DeleteAdministradorById(id_adm);
	}
	
}
