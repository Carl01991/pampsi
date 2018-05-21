package com.ingsoft.allpay.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registro_pagos")
public class RegistroDePagos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_pago")
	private Integer id;
	@Column(name = "fecha")
	private Date fecha;
	@Column(name = "valor")
	private Float valor;
	@Column(name="documento_identificacion")
	private String documentoIdentificacion;
	@Column(name ="id_historico_cobro")
	private Integer idHistoricoCobro;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = new Date();
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public String getDocumentoIdentificacion() {
		return documentoIdentificacion;
	}
	public void setDocumentoIdentificacion(String documentoIdentificacion) {
		this.documentoIdentificacion = documentoIdentificacion;
	}
	public Integer getIdHistoricoCobro() {
		return idHistoricoCobro;
	}
	public void setIdHistoricoCobro(Integer idHistoricoCobro) {
		this.idHistoricoCobro = idHistoricoCobro;
	}
	
	
	
	

}
