package com.ista.string.BACKEND_FIBADI.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8995246846200223104L;

	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	private Long id_cate;
	
	@Column
	private String nombre;
	
	@Column
	private Boolean vigencia;

	public Long getId_cate() {
		return id_cate;
	}

	public void setId_cate(Long id_cate) {
		this.id_cate = id_cate;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getVigencia() {
		return vigencia;
	}

	public void setVigencia(Boolean vigencia) {
		this.vigencia = vigencia;
	}
	
	
}
