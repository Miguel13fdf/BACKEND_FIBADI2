package com.ista.string.BACKEND_FIBADI.Model.Services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ista.string.BACKEND_FIBADI.Dao.ICategoriaRepository;

import static com.ista.string.BACKEND_FIBADI.Model.Services.Global.*;

@Service
@Transactional
public class CategoriaService {
	
	private final ICategoriaRepository repository;
	
	public CategoriaService(ICategoriaRepository repository) {
		this.repository=repository;
	}
	
	public GenericResponse listarCategoriasActivas(){
		return new GenericResponse(TIPO_DATA, RPTA_OK, OPERACION_CORRECTA, this.repository.listarCategoriasActivas());
	}

}
