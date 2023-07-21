package com.ista.string.BACKEND_FIBADI.Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "historial")
public class Historial implements Serializable {

	private static final long serialVersionUID = -5991494988133707854L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	private Long his_cod;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date his_fecha;
	
	private String his_detalles;
	
	@ManyToOne
	@JoinColumn (name = "his_usu_cod", referencedColumnName = "usu_cod")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn (name = "his_bie_cod", referencedColumnName = "bien_cod")
	private Bien bien;
	
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Bien getBien() {
		return bien;
	}

	public void setBien(Bien bien) {
		this.bien = bien;
	}

	public Historial(Date his_fecha, String his_detalles, Usuario usuario, Bien bien) {
		super();
		this.his_fecha = his_fecha;
		this.his_detalles = his_detalles;
		this.usuario = usuario;
		this.bien = bien;
	}

	public Historial() {
		
	}
	
	
}
