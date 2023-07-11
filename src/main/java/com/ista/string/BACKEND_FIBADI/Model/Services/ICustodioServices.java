package com.ista.string.BACKEND_FIBADI.Model.Services;

import java.util.List;

import com.ista.string.BACKEND_FIBADI.Model.Custodio;


public interface ICustodioServices {
	
	public List<Custodio> findAll();
	public Custodio Save (Custodio custodio);
	public Custodio findById(Long cus_cod);
	public void delete(Long cus_cod);

}
