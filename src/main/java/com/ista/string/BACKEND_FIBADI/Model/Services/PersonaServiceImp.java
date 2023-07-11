package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.string.BACKEND_FIBADI.Dao.IPersonaDao;
import com.ista.string.BACKEND_FIBADI.Model.Persona;

@Service
public class PersonaServiceImp implements IPersonaService{
	@Autowired
	private IPersonaDao personaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Persona> listAll() {
		return (List<Persona>) personaDao.findAll();
	}

	@Override
	@Transactional
	public Persona savePersona(Persona persona) {
		return personaDao.save(persona);
	}

	@Override
	@Transactional(readOnly = true)
	public Persona findPersonaById(Long idPersona) {
		return personaDao.findById(idPersona).orElse(new Persona());
	}

	@Override
	@Transactional
	public void deletePersonaById(Long idPersona) {
		personaDao.deleteById(idPersona);
	}

	@Override
	@Transactional(readOnly = true)
	public Persona findPersonasByCriteria(String criterio) {
		return personaDao.findPersonasByCriteria(criterio);
	}
}
