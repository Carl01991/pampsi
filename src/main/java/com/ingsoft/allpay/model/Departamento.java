package com.ingsoft.allpay.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "departamento")
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_departamento")
	private Integer idDepartamento;
	@Column(name = "nombre")
	private String nombre;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "departamento")
	@JsonManagedReference
	Set<Municipio> municipios = new HashSet<Municipio>();
	
	
	
	public Integer getIdDepartamento() {
		return idDepartamento;
	}
	public void setIdDepartamento(Integer idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Set<Municipio> getMunicipios() {
		return municipios;
	}
	public void setMunicipios(Set<Municipio> municipios) {
		this.municipios = municipios;
	}
	
	
	
	
	
	
	
	
}
