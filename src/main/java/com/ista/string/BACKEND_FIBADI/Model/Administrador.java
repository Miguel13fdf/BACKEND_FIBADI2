package com.ista.string.BACKEND_FIBADI.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Administrador implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 4342051221624286849L;

	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE) 
	private Long adm_cod;
	
	//FK adm_per_cod;
	
	@Column (unique = true)
	private String adm_usuario;
	
	private String adm_contrasenia;

	public Long getAdm_cod() {
		return adm_cod;
	}

	public void setAdm_cod(Long adm_cod) {
		this.adm_cod = adm_cod;
	}

	public String getAdm_usuario() {
		return adm_usuario;
	}

	public void setAdm_usuario(String adm_usuario) {
		this.adm_usuario = adm_usuario;
	}

	public String getAdm_contrasenia() {
		return adm_contrasenia;
	}

	public void setAdm_contrasenia(String adm_contrasenia) {
		this.adm_contrasenia = adm_contrasenia;
	}
	
}
