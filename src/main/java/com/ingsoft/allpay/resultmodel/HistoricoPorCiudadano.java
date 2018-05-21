package com.ingsoft.allpay.resultmodel;

import java.util.Date;

public class HistoricoPorCiudadano {
	private Integer docuemntoDeCobro;
	private Date fecha;
	private Double valorPagar;
	
	
	
	
	
	public Integer getDocuemntoDeCobro() {
		return docuemntoDeCobro;
	}
	public void setDocuemntoDeCobro(Integer docuemntoDeCobro) {
		this.docuemntoDeCobro = docuemntoDeCobro;
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
	public HistoricoPorCiudadano(Integer docuemntoDeCobro, Date fecha, Double valorPagar) {
		super();
		this.docuemntoDeCobro = docuemntoDeCobro;
		this.fecha = fecha;
		this.valorPagar = valorPagar;
	}
	
	public HistoricoPorCiudadano(Integer docuemntoDeCobro, Date fecha) {
		super();
		this.docuemntoDeCobro = docuemntoDeCobro;
		this.fecha = fecha;
	}
	

}
