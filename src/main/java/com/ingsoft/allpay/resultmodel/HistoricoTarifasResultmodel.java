package com.ingsoft.allpay.resultmodel;


public class HistoricoTarifasResultmodel {

	private Integer idHistoricoTarifa;
	private Integer periodo;
	private String descripcion;
	private Double tarifa;
	private Integer estado;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	public HistoricoTarifasResultmodel(Integer idHistoricoTarifa, Integer periodo, String descripcion, Double tarifa,
			Integer estado) {
		super();
		this.idHistoricoTarifa = idHistoricoTarifa;
		this.periodo = periodo;
		this.descripcion = descripcion;
		this.tarifa = tarifa;
		this.estado = estado;
	}
	
	
	
}
