package com.ista.string.BACKEND_FIBADI.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "roles")
public class Rol implements Serializable {

	private static final long serialVersionUID = -4234390864684583906L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long rol_cod;
	
	@Column (unique = true)
	private String rol_nombre;
	
	private Boolean rol_estado;

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

	public Boolean getRol_estado() {
		return rol_estado;
	}

	public void setRol_estado(Boolean rol_estado) {
		this.rol_estado = rol_estado;
	}
	
}
