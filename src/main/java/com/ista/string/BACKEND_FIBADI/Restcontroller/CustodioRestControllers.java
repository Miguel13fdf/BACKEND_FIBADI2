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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ista.string.BACKEND_FIBADI.Model.Custodio;
import com.ista.string.BACKEND_FIBADI.Model.Services.ICustodioServices;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")

public class CustodioRestControllers {
	
	@Autowired
	
	private ICustodioServices custodioServices;
	
	// listar todos los custodios
		@GetMapping("/custodio")
		public List<Custodio> index() {
			return custodioServices.findAll();
		}

		// buscar un custodio por id_custodio
		@GetMapping("/custodio/{cus_cod}")
		public Custodio show(@PathVariable Long cus_cod) {
			return custodioServices.findById(cus_cod);
		}

		// guardar un custodio
		@PostMapping("/custodio")
		@ResponseStatus(HttpStatus.CREATED)
		public Custodio create(@RequestBody Custodio custodio) {
			return custodioServices.Save(custodio);
		}

		// editar un custodio
		@PutMapping("/custodio/{cus_cod}")
		@ResponseStatus(HttpStatus.CREATED)
		public Custodio update(@RequestBody Custodio custodio, @PathVariable Long cus_cod) {
			Custodio custodioActual = custodioServices.findById(cus_cod);
			custodioActual.setCus_cod(custodio.getCus_cod());
			custodioActual.setCus_contrasena(custodio.getCus_contrasena());
			custodioActual.setCus_usuario(custodio.getCus_usuario());
			custodioActual.setCus_estado(custodio.getCus_estado());
			

			return custodioServices.Save(custodioActual);

		}

		// eliminar un cliente
		@DeleteMapping("custodio/{cus_cod}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long cus_cod) {
			custodioServices.delete(cus_cod);
		}


}
