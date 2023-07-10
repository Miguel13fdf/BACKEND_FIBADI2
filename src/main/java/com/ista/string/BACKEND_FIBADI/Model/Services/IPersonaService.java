package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ista.string.BACKEND_FIBADI.Model.Persona;

public interface IPersonaService{
	public List<Persona> listAll();

	public Persona savePersona(Persona persona);

	public Persona findPersonaById(Long idPersona);

	public void deletePersonaById(Long idPersona);

	public Persona findPersonasByCriteria(String criterio);
}
