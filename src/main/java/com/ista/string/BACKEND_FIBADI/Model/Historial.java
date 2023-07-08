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
public class Historial implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5991494988133707854L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	private Long his_cod;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date his_fecha;
	
	private String his_detalles;

	/*
	 * FK his_cus_cod
	 * FK his_bie_cod
	 * */
	
	public Long getHis_cod() {
		return his_cod;
	}

	public void setHis_cod(Long his_cod) {
		this.his_cod = his_cod;
	}

	public Date getHis_fecha() {
		return his_fecha;
	}

	public void setHis_fecha(Date his_fecha) {
		this.his_fecha = his_fecha;
	}

	public String getHis_detalles() {
		return his_detalles;
	}

	public void setHis_detalles(String his_detalles) {
		this.his_detalles = his_detalles;
	}
	
}
