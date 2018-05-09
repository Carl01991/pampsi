package com.ingsoft.allpay.model;

import java.sql.Date;

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
@Table(name = "historico_cobros")
public class HistorialCobros {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_historico_cobros")
	private Integer idHistoricoCobros;
	@Column(name = "fecha")
	private Date fecha;
	@Column(name = "valor")
	private Double valor;
	@Column(name = "pagado")
	private Integer pagado;
	@Column(name = "documento_identificacion")
	private String documentoIdentificacion;
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JsonBackReference
//	@JoinColumn(name="id_ciudadano")
//	private CiudadanoActual ciudadano;
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonBackReference
	@JoinColumn(name="id_detalle_servicio")
	private DetalleServicio detalleServicio;
	
	
	public Integer getIdHistoricoCobros() {
		return idHistoricoCobros;
	}
	public void setIdHistoricoCobros(Integer idHistoricoCobros) {
		this.idHistoricoCobros = idHistoricoCobros;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Integer getPagado() {
		return pagado;
	}
	public void setPagado(Integer pagado) {
		this.pagado = pagado;
	}
//	public CiudadanoActual getCiudadano() {
//		return ciudadano;
//	}
//	public void setCiudadano(CiudadanoActual ciudadano) {
//		this.ciudadano = ciudadano;
//	}
	public DetalleServicio getDetalleServicio() {
		return detalleServicio;
	}
	public void setDetalleServicio(DetalleServicio detalleServicio) {
		this.detalleServicio = detalleServicio;
	}
	
	public String getDocumentoIdentificacion() {
		return documentoIdentificacion;
	}
	public void setDocumentoIdentificacion(String documentoIdentificacion) {
		this.documentoIdentificacion = documentoIdentificacion;
	}
	
	
	

}
