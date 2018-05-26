package com.ingsoft.allpay.resultmodel;

public class ServiciosPrestadosResult {
	
	private Integer idServicio;
	private String nombreServicio;
	private Integer estado;
	private String  tipo;
	
	
	
	public int getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}
	public String getNombreServicio() {
		return nombreServicio;
	}
	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public ServiciosPrestadosResult(Integer idServicio, String nombreServicio,
			Integer estado, String tipo) {
		super();
		this.idServicio = idServicio;
		this.nombreServicio = nombreServicio;
		this.estado = estado;
		this.tipo = tipo;
	}



}