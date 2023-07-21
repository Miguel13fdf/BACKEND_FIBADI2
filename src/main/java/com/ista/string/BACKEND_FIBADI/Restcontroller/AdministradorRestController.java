package com.ista.string.BACKEND_FIBADI.Restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.string.BACKEND_FIBADI.Model.Administrador;
import com.ista.string.BACKEND_FIBADI.Model.Services.IAdministradorService;


@CrossOrigin(origins = {"http://localhost:4200", "http://192.168.20.176:4200"})
@RestController
@RequestMapping("/tecazuay")

public class AdministradorRestController {
	

@Autowired
	
	private IAdministradorService adminServices;
	
		@GetMapping("/administradores")
		public List<Administrador> index() {
			return adminServices.findAll();
		}

		@GetMapping("/administradores/{adm_cod}")
		public Administrador show(@PathVariable Long adm_cod) {
			return adminServices.findAdminById(adm_cod);
		}

		@PostMapping("/administradores")
		public Administrador create(@RequestBody Administrador administrador) {
			return adminServices.SaveAdmin(administrador);
		}

		@PutMapping("/administradores/{adm_cod}")
		public Administrador update(@RequestBody Administrador administrador, @PathVariable Long adm_cod) {
			Administrador administradorActual = adminServices.findAdminById(adm_cod);
			administradorActual.setAdm_usuario(administrador.getAdm_usuario());
			administradorActual.setAdm_contrasenia(administrador.getAdm_contrasenia());
			administradorActual.setAdm_estado(administrador.getAdm_estado());

			return adminServices.SaveAdmin(administradorActual);

		}
}
