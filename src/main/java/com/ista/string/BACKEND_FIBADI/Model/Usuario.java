package com.ista.string.BACKEND_FIBADI.Model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table (name = "usuarios")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 4342051221624286849L;

	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE) 
	private Long usu_cod;
	
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "usu_per_cod", referencedColumnName = "per_cod")
	private Persona persona;
	
	//FK usu_rol
	
	@Column (unique = true)
	private String usu_usuario;
	
	private String usu_contrasenia;

	private Boolean usu_estado;

	public Long getUsu_cod() {
		return usu_cod;
	}

	public void setUsu_cod(Long usu_cod) {
		this.usu_cod = usu_cod;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getUsu_usuario() {
		return usu_usuario;
	}

	public void setUsu_usuario(String usu_usuario) {
		this.usu_usuario = usu_usuario;
	}

	public String getUsu_contrasenia() {
		return usu_contrasenia;
	}

	public void setUsu_contrasenia(String usu_contrasenia) {
		this.usu_contrasenia = usu_contrasenia;
	}

	public Boolean getUsu_estado() {
		return usu_estado;
	}

	public void setUsu_estado(Boolean usu_estado) {
		this.usu_estado = usu_estado;
	}

}
