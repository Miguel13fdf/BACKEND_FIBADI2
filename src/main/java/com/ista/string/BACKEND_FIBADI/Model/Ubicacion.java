package com.ista.string.BACKEND_FIBADI.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table(name ="ubicacion")
public class Ubicacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long ubi_cod;
	private String ubi_nombre;
	private String ubi_departamento;
	private Boolean ubi_estado;

	public Long getUbi_cod() {
		return ubi_cod;
	}

	public void setUbi_cod(Long ubi_cod) {
		this.ubi_cod = ubi_cod;
	}

	public String getUbi_nombre() {
		return ubi_nombre;
	}

	public void setUbi_nombre(String ubi_nombre) {
		this.ubi_nombre = ubi_nombre;
	}

	public String getUbi_departamento() {
		return ubi_departamento;
	}

	public void setUbi_departamento(String ubi_departamento) {
		this.ubi_departamento = ubi_departamento;
	}

	public Boolean getUbi_estado() {
		return ubi_estado;
	}

	public void setUbi_estado(Boolean ubi_estado) {
		this.ubi_estado = ubi_estado;
	}
	
}
