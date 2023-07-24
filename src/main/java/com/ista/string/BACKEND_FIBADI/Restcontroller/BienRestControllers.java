package com.ista.string.BACKEND_FIBADI.Restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import com.ista.string.BACKEND_FIBADI.Model.Bien;
import com.ista.string.BACKEND_FIBADI.Model.Usuario;
import com.ista.string.BACKEND_FIBADI.Model.Services.IBienServices;
import com.ista.string.BACKEND_FIBADI.Model.Services.IHistorialService;
import com.ista.string.BACKEND_FIBADI.Model.request.UdescripcionLugarRequest;
import java.util.Date;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/tecazuay")
public class BienRestControllers {
	
	@Autowired
	private IBienServices bienServices;
	 @Autowired
	    private IHistorialService historialService;
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
			 Bien nuevoBien = bienServices.Save(bien);

		        Usuario usuarioDelBien = nuevoBien.getUsuario();
		        String detalles = "Se ha creado un nuevo bien.";
		        Date fechaActual = new Date();
		        historialService.saveInHistorial(nuevoBien, usuarioDelBien, detalles, fechaActual);

		        return nuevoBien;
			//return bienServices.Save(bien);
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
			BienActual.setBien_estado(bien.getBien_estado());
			BienActual.setBien_detalles(bien.getBien_detalles());
			BienActual.setBien_descripcion(bien.getBien_descripcion());
			BienActual.setBien_serie(bien.getBien_serie());
			BienActual.setBien_precio(bien.getBien_precio());
			BienActual.setBien_estadoA(bien.getBien_estadoA());
			BienActual.setUsuario(bien.getUsuario());
			BienActual.setUbicacion(bien.getUbicacion());
			BienActual.setPropietario(bien.getPropietario());
			BienActual.setCategoria(bien.getCategoria());
			BienActual.setBien_estado_asignado(bien.getBien_estado_asignado());
			return bienServices.Save(BienActual);
		}

		// eliminar un cliente
		@DeleteMapping("bien/{bien_cod}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long bien_cod) {
			bienServices.delete(bien_cod);
		}
		// Obtener bienes por usuario y contraseña
	    @GetMapping("/bien/usuario-contrasenia")
	    public List<Bien> obtenerBienesPorUsuarioYContrasenia(@RequestParam("usuario") String usuario,
	                                                          @RequestParam("contrasenia") String contrasenia) {
	        return bienServices.getBienesPorUsuarioYContrasenia(usuario, contrasenia);
	    }

		@GetMapping("/bien/cedula")
		public List<Bien> findBienByCedula(@RequestParam("cedula") String cedula) {
			return bienServices.findBienByCedulaCustodio(cedula);
		}
		
		@GetMapping("/bien/categoria")
		public List<Bien> findBienByCategoria(@RequestParam("categoria") String categoria) {
			return bienServices.findBienByCategoria(categoria);
		}
		
		@GetMapping("/bien/argument")
		public List<Bien> findBienesByArgument(@RequestParam("argument") String argument) {
			return bienServices.findBienesByArgument(argument);
		}
		
		@GetMapping("/bien/argument2")
		public List<Bien> findBienesByArgument2(@RequestParam("argument2") String argument2) {
			return bienServices.findBienesByArgument(argument2);
		}
		
		@GetMapping("/bien/codigo-barras")
	    public ResponseEntity<Bien> obtenerDatosBienPorCodigoBarras(@RequestParam("codigoBarras") String codigoBarras) {
	        // Buscar el bien por código de barras en la base de datos
	        Bien bien = bienServices.findByCodigoBarras(codigoBarras);
	        
	        if (bien != null) {
	            bien.setBien_estadoA(true);
	            bienServices.Save(bien);
	            return ResponseEntity.ok(bien);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
		@PutMapping("/bien/actualizar-descripcion-lugar/{bien_codigoG}")
	    public ResponseEntity<Bien> actualizarDescripcionLugar(@RequestBody UdescripcionLugarRequest request) {
	        String bienCodigoG = request.getBien_codigoG();
	        String nuevaDescripcionLugar = request.getBien_descripcion_lugar();

	        Bien bien = bienServices.findByCodigoBarras(bienCodigoG);

	        if (bien != null) {
	            bien.setBien_descripcion_lugar(nuevaDescripcionLugar);
	            bienServices.Save(bien);
	            return ResponseEntity.ok(bien);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
}
