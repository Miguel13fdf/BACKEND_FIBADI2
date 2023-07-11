package com.ista.string.BACKEND_FIBADI.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Roles implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long rol_cod;
	private String rol_nombre;
	private String rol_estado;
	
	public Long getRol_cod() {
		return rol_cod;
	}

	public void setRol_cod(Long rol_cod) {
		this.rol_cod = rol_cod;
	}

	public String getRol_nombre() {
		return rol_nombre;
	}

	public void setRol_nombre(String rol_nombre) {
		this.rol_nombre = rol_nombre;
	}

	public String getRol_estado() {
		return rol_estado;
	}

	public void setRol_estado(String rol_estado) {
		this.rol_estado = rol_estado;
	}
	

}
