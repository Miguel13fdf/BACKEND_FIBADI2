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

import com.ista.string.BACKEND_FIBADI.Model.Categoria;
import com.ista.string.BACKEND_FIBADI.Model.Historial;
import com.ista.string.BACKEND_FIBADI.Model.Services.ICategoriaService;
import com.ista.string.BACKEND_FIBADI.Model.Services.IHistorialService;

@RestController
@RequestMapping ("/tecazuay")
public class CategoriaRestControllers {

	@Autowired
	private ICategoriaService categoriaService;
	
	@GetMapping ("/categoria")
	public List<Categoria> index() {
		return categoriaService.findAll();
	}
	
	@GetMapping ("/categoria/{id}")
	public Categoria findCategoriaById(@PathVariable("id") Long cat_id) {
		return categoriaService.findCategoriaById(cat_id);
	}
	
	@PostMapping ("/categoria")
	@ResponseStatus (HttpStatus.CREATED)
	public Categoria createCategoria(@RequestBody Categoria categoria) {
		return categoriaService.saveCategoria(categoria);
	}
	
	@PutMapping ("/categoria/{id}")
	public Categoria updateCategoria(@RequestBody Categoria categoria, @PathVariable("id") Long cat_id) {
		Categoria categoriaActual = categoriaService.findCategoriaById(cat_id);
		categoriaActual.setCat_descripcion(categoria.getCat_descripcion());
		categoriaActual.setCat_nombre(categoria.getCat_nombre());
		categoriaActual.setCat_estado(categoria.getCat_estado());
		
		return  categoriaService.saveCategoria(categoriaActual);
	}
}
