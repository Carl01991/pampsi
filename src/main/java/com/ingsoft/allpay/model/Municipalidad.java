package com.ingsoft.allpay.model;

import java.util.HashSet;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;




@Entity
@Table(name = "municipalidad")
public class Municipalidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_municipalidad")
	private Integer idMunicipalidad;
	@Column(name = "Nombre")
	private String nombre;
	@Column(name = "direccion")
	private String direccion;
	@Column(name ="codigo_postal")
	private String codigoPostal;
	@Column(name = "categoria")
	private String categoria;
	@OneToMany(fetch = FetchType.EAGER, mappedBy="servicios")
	@JsonManagedReference
	Set<ServiciosMuni> servicios = new HashSet<ServiciosMuni>();
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonBackReference
	@JoinColumn(name = "id_municipio")
	private Municipio municipio;
	
	public Integer getIdMunicipalidad() {
		return idMunicipalidad;
	}
	public void setIdMunicipalidad(Integer idMunicipalidad) {
		this.idMunicipalidad = idMunicipalidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Set<ServiciosMuni> getServicios() {
		return servicios;
	}
	public void setServicios(Set<ServiciosMuni> servicios) {
		this.servicios = servicios;
	}
	public Municipio getMunicipio() {
		return municipio;
	}
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	
	
	

}
