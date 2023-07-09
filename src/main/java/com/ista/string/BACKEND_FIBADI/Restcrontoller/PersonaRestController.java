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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.ista.string.BACKEND_FIBADI.Model.Persona;
import com.ista.string.BACKEND_FIBADI.Model.Services.IPersonaService;
@RestController
@RequestMapping ("/Persona ")
public class PersonaRestController {
	@Autowired
	private IPersonaService personaService;

	@GetMapping("/personas")
	public List<Persona> index() {
		return personaService.listAll();
	}

	@GetMapping("/personas/{id}")
	public Persona findPersonaById(@PathVariable("id") Long idPersona) {
		return personaService.findPersonaById(idPersona);
	}

	@PostMapping("/personas")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona createPersona(@RequestBody Persona persona) {
		return personaService.savePersona(persona);
	}

	@PutMapping("/personas/{id}")
	public Persona updatePersona(@RequestBody Persona persona, @PathVariable("id") Long idPersona) {
		Persona personaActual = personaService.findPersonaById(idPersona);
		personaActual.setPerCedula(persona.getPerCedula());
		personaActual.setPerPrimerNom(persona.getPerPrimerNom());
		personaActual.setPerSegundoNom(persona.getPerSegundoNom());
		personaActual.setPerApellidoPater(persona.getPerApellidoPater());
		personaActual.setPerApellidoMater(persona.getPerApellidoMater());
		personaActual.setPerTelefono(persona.getPerTelefono());
		personaActual.setPerGenero(persona.getPerGenero());
		personaActual.setPerEmail(persona.getPerEmail());
		personaActual.setPerFechaNac(persona.getPerFechaNac());

		return personaService.savePersona(personaActual);
	}

	@DeleteMapping("/personas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletePersona(@PathVariable("id") Long idPersona) {
		personaService.deletePersonaById(idPersona);
	}

	@GetMapping("/personas/criterio")
	public List<Persona> findPersonasByCriteria(@RequestParam("criterio") String criterio) {
		return personaService.findPersonasByCriteria(criterio);
	}
}
