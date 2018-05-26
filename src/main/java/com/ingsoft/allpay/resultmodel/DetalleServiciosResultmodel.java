package com.ingsoft.allpay.resultmodel;



public class DetalleServiciosResultmodel {

	private Integer idDetalleServicio;
	private String nombre;
	private Integer estado;
	private Integer idProveedor;
	private String proveedor;
	
	
	
	
	public Integer getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
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
	public DetalleServiciosResultmodel(Integer idDetalleServicio, String nombre, Integer estado, Integer idProveedor,
			String proveedor) {
		super();
		this.idDetalleServicio = idDetalleServicio;
		this.nombre = nombre;
		this.estado = estado;
		this.idProveedor = idProveedor;
		this.proveedor = proveedor;
	}
	
	
	
	
}


