package com.ista.string.BACKEND_FIBADI.Restcrontoller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.string.BACKEND_FIBADI.Model.Services.CategoriaService;
import com.ista.string.BACKEND_FIBADI.Model.Services.GenericResponse;

@RestController
@RequestMapping("/tecazuay")
public class CategoriaController {
	private final CategoriaService service;
	
	public CategoriaController(CategoriaService service) {
		this.service=service;
	}
	
	@GetMapping
	public GenericResponse listarCategoriasActivas() {
		return this.service.listarCategoriasActivas();
	}

}
