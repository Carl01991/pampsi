package com.ingsoft.allpay.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "historico_tarifas")
public class HistoricoTarifas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_historico_tarifa")
	private Integer idHistoricoTarifa;
	@Column(name = "periodo")
	private Integer periodo;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "tarifa")
	private Double tarifa;
	@Column(name = "estado")
	private Integer estado;
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonBackReference
	@JoinColumn(name="id_detalle_servicio")
	private DetalleServicio detalleServicio;
	
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getIdHistoricoTarifa() {
		return idHistoricoTarifa;
	}
	public void setIdHistoricoTarifa(Integer idHistoricoTarifa) {
		this.idHistoricoTarifa = idHistoricoTarifa;
	}
	public Integer getPeriodo() {
		return periodo;
	}
	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}
	public Double getTarifa() {
		return tarifa;
	}
	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public DetalleServicio getDetalleServicio() {
		return detalleServicio;
	}
	public void setDetalleServicio(DetalleServicio detalleServicio) {
		this.detalleServicio = detalleServicio;
	}
	
	
	
	

}
