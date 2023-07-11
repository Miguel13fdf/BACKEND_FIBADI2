package com.ista.string.BACKEND_FIBADI.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="custodios")

public class Custodio implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long cus_cod;
	private String cus_usuario;
	private String cus_contrasena;
	private Boolean cus_estado;
	
	
	public Long getCus_cod() {
		return cus_cod;
	}
	public void setCus_cod(Long cus_cod) {
		this.cus_cod = cus_cod;
	}
	public String getCus_usuario() {
		return cus_usuario;
	}
	public void setCus_usuario(String cus_usuario) {
		this.cus_usuario = cus_usuario;
	}
	public String getCus_contrasena() {
		return cus_contrasena;
	}
	public void setCus_contrasena(String cus_contrasena) {
		this.cus_contrasena = cus_contrasena;
	}
	public Boolean getCus_estado() {
		return cus_estado;
	}
	public void setCus_estado(Boolean cus_estado) {
		this.cus_estado = cus_estado;
	}
	
	
	
	

}
