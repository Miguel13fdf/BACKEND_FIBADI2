package com.ista.string.BACKEND_FIBADI.Restcrontoller;

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

import com.ista.string.BACKEND_FIBADI.Model.Bien;
import com.ista.string.BACKEND_FIBADI.Services.IBienServices;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")

public class BienRestControllers {
	
	@Autowired
	
	private IBienServices bienServices;
	
	// listar todos los bienes
		@GetMapping("/bien")
		public List<Bien> index() {
			return bienServices.findAll();
		}

		// buscar un bien por id_bien
		@GetMapping("/bien/{bien_cod}")
		public Bien show(@PathVariable Long bien_cod) {
			return bienServices.findById(bien_cod);
		}

		// guardar un bien
		@PostMapping("/bien")
		@ResponseStatus(HttpStatus.CREATED)
		public Bien create(@RequestBody Bien bien) {
			return bienServices.Save(bien);
		}

		// editar un bien
		@PutMapping("/bien/{bien_cod}")
		@ResponseStatus(HttpStatus.CREATED)
		public Bien update(@RequestBody Bien bien, @PathVariable Long bien_cod) {
			Bien BienActual = bienServices.findById(bien_cod);
			BienActual.setBien_cod(bien.getBien_cod());
			BienActual.setBien_codigoG(bien.getBien_codigoG());
			BienActual.setBien_modelo(bien.getBien_modelo());
			BienActual.setBien_marca(bien.getBien_marca());
			BienActual.setBien_estado(bien.getBien_estadoA());
			BienActual.setBien_detalles(bien.getBien_detalles());
			BienActual.setBien_descripcion(bien.getBien_descripcion());
			BienActual.setBien_serie(bien.getBien_serie());
			BienActual.setBien_propietario(bien.getBien_propietario());
			BienActual.setBien_precio(bien.getBien_precio());
			BienActual.setBien_estadoA(bien.getBien_estadoA());

			return bienServices.Save(BienActual);

		}

		// eliminar un cliente
		@DeleteMapping("bien/{bien_cod}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long bien_cod) {
			bienServices.delete(bien_cod);
		}

}
