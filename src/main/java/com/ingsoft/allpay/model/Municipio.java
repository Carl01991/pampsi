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
@Table(name = "municipio")
public class Municipio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id_municipio")
	private Integer idMunicipio;
	@Column(name = "nombre")
	private String nombre;
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonBackReference
	@JoinColumn(name = "id_departamento")
	private Departamento departamento;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "municipalidades")
	@JsonManagedReference
	Set<Municipalidad> municipalidades = new HashSet<Municipalidad>();
	
	
	public Integer getIdMunicipio() {
		return idMunicipio;
	}
	public void setIdMunicipio(Integer idMunicipio) {
		this.idMunicipio = idMunicipio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public Set<Municipalidad> getMunicipalidades() {
		return municipalidades;
	}
	public void setMunicipalidades(Set<Municipalidad> municipalidades) {
		this.municipalidades = municipalidades;
	}
	
	
	
	
	

}
