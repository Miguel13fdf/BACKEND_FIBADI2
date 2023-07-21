package com.ista.string.BACKEND_FIBADI.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="administradores")
public class Administrador implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 523154629469580484L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long adm_cod;
	private String adm_usuario;
	private String adm_contrasenia;
	private Boolean adm_estado;

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


	public Boolean getAdm_estado() {
		return adm_estado;
	}

	public void setAdm_estado(Boolean adm_estado) {
		this.adm_estado = adm_estado;
	}
	

}
