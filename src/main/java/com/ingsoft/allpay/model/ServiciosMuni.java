package com.ingsoft.allpay.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "servicios_muni")
public class ServiciosMuni {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id_servicio")
	private Integer idServicio;
	@Column(name ="descripcion")
	private String descripcion;
	@Column(name = "valor")
	private String valor;
	@Column(name = "periodo")
	private Integer periodo;
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonBackReference
	@JoinColumn(name="id_municipalidad")
	private Municipalidad municipalidad;
	
	
	
	public Integer getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Integer getPeriodo() {
		return periodo;
	}
	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}
	public Municipalidad getMunicipalidad() {
		return municipalidad;
	}
	public void setMunicipalidad(Municipalidad municipalidad) {
		this.municipalidad = municipalidad;
	}
	
	
	
	
	
}
