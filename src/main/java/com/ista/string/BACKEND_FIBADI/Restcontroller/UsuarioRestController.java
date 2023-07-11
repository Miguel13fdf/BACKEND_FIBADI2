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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.ista.string.BACKEND_FIBADI.Model.Usuario;
import com.ista.string.BACKEND_FIBADI.Model.Services.IUsuarioService;

@RestController
@RequestMapping ("/tecazuay")
public class UsuarioRestController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping ("/usuarios")
	public List<Usuario> index() {
		return usuarioService.ListAll();
	}
	
	@GetMapping ("/usuarios/{id}")
	public Usuario findUserById(@PathVariable("id") Long id_usu) {
		return usuarioService.findUsuarioById(id_usu);
	}
	
	@PostMapping ("/usuarios")
	@ResponseStatus (HttpStatus.CREATED)
	public Usuario createUser(@RequestBody Usuario usuario) {
		return usuarioService.saveUsuario(usuario);
	}
	
	@PutMapping ("/usuarios/{id}")
	public Usuario updateUser(@RequestBody Usuario usuario, @PathVariable("id") Long id_usu) {
		Usuario usuarioActual = usuarioService.findUsuarioById(id_usu);
		usuarioActual.setUsu_usuario(usuario.getUsu_usuario());
		usuarioActual.setUsu_contrasenia(usuario.getUsu_contrasenia());
		usuarioActual.setPersona(usuario.getPersona());
		usuarioActual.setUsu_estado(usuario.getUsu_estado());
		
		return  usuarioService.saveUsuario(usuarioActual);
	}

	@GetMapping("/usuarios/criterio")
	public Usuario findUserByCriterio(@RequestParam("criterio") String criterio) {
	    return usuarioService.findUsuarioByCriterio(criterio);
	}
	
}
