package com.ingsoft.allpay.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "ciudadano_actual")
public class CiudadanoActual {
	
	@Id
	@Column(name = "cui")
	private String cui;
	@Column(name = "nombres")
	private String nombres;
	@Column(name = "apellidos")
	private String apellidos;
	@Column(name = "direccion")
	private String direccion;
//	@OneToMany(fetch = FetchType.EAGER, mappedBy="ciudadano")
//	@JsonManagedReference
//	Set<HistorialCobros> cobros = new HashSet<HistorialCobros>();
	
	
	public String getCui() {
		return cui;
	}
	public void setCui(String cui) {
		this.cui = cui;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
//	public Set<HistorialCobros> getCobros() {
//		return cobros;
//	}
//	public void setCobros(Set<HistorialCobros> cobros) {
//		this.cobros = cobros;
//	}
	
	

}
