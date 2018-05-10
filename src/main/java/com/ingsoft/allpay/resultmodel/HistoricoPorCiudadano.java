package com.ingsoft.allpay.resultmodel;

import java.util.Date;

public class HistoricoPorCiudadano {
	private Integer id;
	private Date fecha;
	private Double valorPagar;
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
		this.fecha = fecha;
	}
	public Double getValorPagar() {
		return valorPagar;
	}
	public void setValorPagar(Double valorPagar) {
		this.valorPagar = valorPagar;
	}
	public HistoricoPorCiudadano(Integer id, Date fecha, Double valorPagar) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.valorPagar = valorPagar;
	}
	
	public HistoricoPorCiudadano(Integer id, Date fecha) {
		super();
		this.id = id;
		this.fecha = fecha;
	}
	

}
