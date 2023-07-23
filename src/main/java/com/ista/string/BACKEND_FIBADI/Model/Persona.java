package com.ista.string.BACKEND_FIBADI.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Persona implements Serializable{

	private static final long serialVersionUID = 4342051221624286849L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "per_cod")
	private Long perCod;

	@Column(unique = true, name = "per_cedula", nullable = false, length = 10)
	private String perCedula;

	@Column(name = "per_primernom", nullable = false)
	private String perPrimerNom;

	@Column(name = "per_segundonom")
	private String perSegundoNom;

	@Column(name = "per_apellidopater", nullable = false)
	private String perApellidoPater;

	@Column(name = "per_apellidomater")
	private String perApellidoMater;

	@Column(name = "per_telefono", nullable = false)
	private String perTelefono;

	@Column(name = "per_genero", nullable = false, length = 1)
	private String perGenero;

	@Column(unique = true, name = "per_email", nullable = false)
	private String perEmail;

	@Column(name = "per_fechanac", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date perFechaNac;

	public Long getPerCod() {
		return perCod;
	}

	public void setPerCod(Long perCod) {
		this.perCod = perCod;
	}

	public String getPerCedula() {
		return perCedula;
	}

	public void setPerCedula(String perCedula) {
		this.perCedula = perCedula;
	}

	public String getPerPrimerNom() {
		return perPrimerNom;
	}

	public void setPerPrimerNom(String perPrimerNom) {
		this.perPrimerNom = perPrimerNom;
	}

	public String getPerSegundoNom() {
		return perSegundoNom;
	}

	public void setPerSegundoNom(String perSegundoNom) {
		this.perSegundoNom = perSegundoNom;
	}

	public String getPerApellidoPater() {
		return perApellidoPater;
	}

	public void setPerApellidoPater(String perApellidoPater) {
		this.perApellidoPater = perApellidoPater;
	}

	public String getPerApellidoMater() {
		return perApellidoMater;
	}

	public void setPerApellidoMater(String perApellidoMater) {
		this.perApellidoMater = perApellidoMater;
	}

	public String getPerTelefono() {
		return perTelefono;
	}

	public void setPerTelefono(String perTelefono) {
		this.perTelefono = perTelefono;
	}

	public String getPerGenero() {
		return perGenero;
	}

	public void setPerGenero(String perGenero) {
		this.perGenero = perGenero;
	}

	public String getPerEmail() {
		return perEmail;
	}

	public void setPerEmail(String perEmail) {
		this.perEmail = perEmail;
	}

	public Date getPerFechaNac() {
		return perFechaNac;
	}

	public void setPerFechaNac(Date perFechaNac) {
		this.perFechaNac = perFechaNac;
	}
}
