package com.ista.string.BACKEND_FIBADI.Model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table (name = "usuarios")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 4342051221624286849L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	private Long usu_cod;
	
	@OneToOne (cascade = CascadeType.MERGE)
	@JoinColumn (name = "usu_per_cod", referencedColumnName = "per_cod")
	private Persona persona;
	
	//FK usu_rol
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(
			name = "usuarios_roles",
			joinColumns = @JoinColumn(name = "usuario_id",referencedColumnName = "usu_cod"),
			inverseJoinColumns = @JoinColumn(name = "rol_id",referencedColumnName = "rol_cod")
			)
	private Collection<Rol> roles;
	
	@Column (unique = true)
	private String usuario;
	
	private String contrasenia;

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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Boolean getUsu_estado() {
		return usu_estado;
	}
	

	public Collection<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Rol> roles) {
		this.roles = roles;
	}

	public void setUsu_estado(Boolean usu_estado) {
		this.usu_estado = usu_estado;
	}

}
