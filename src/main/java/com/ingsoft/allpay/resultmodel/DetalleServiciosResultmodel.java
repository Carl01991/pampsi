package com.ingsoft.allpay.resultmodel;



public class DetalleServiciosResultmodel {

	private Integer idDetalleServicio;
	private String nombre;
	private Integer estado;
	public Integer getIdDetalleServicio() {
		return idDetalleServicio;
	}
	public void setIdDetalleServicio(Integer idDetalleServicio) {
		this.idDetalleServicio = idDetalleServicio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public DetalleServiciosResultmodel(Integer idDetalleServicio, String nombre, Integer estado) {
		super();
		this.idDetalleServicio = idDetalleServicio;
		this.nombre = nombre;
		this.estado = estado;
	}
	
	
	
}


