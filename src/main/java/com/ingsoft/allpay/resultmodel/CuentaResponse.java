package com.ingsoft.allpay.resultmodel;



public class CuentaResponse {
	
	private Integer idCuenta;
	private String noCuenta;
	private String documentoIdentificacion;
	private Integer tipo;
	public Integer getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(Integer idCuenta) {
		this.idCuenta = idCuenta;
	}
	public String getNoCuenta() {
		return noCuenta;
	}
	public void setNoCuenta(String noCuenta) {
		this.noCuenta = noCuenta;
	}
	public String getDocumentoIdentificacion() {
		return documentoIdentificacion;
	}
	public void setDocumentoIdentificacion(String documentoIdentificacion) {
		this.documentoIdentificacion = documentoIdentificacion;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public CuentaResponse(Integer idCuenta, String noCuenta, String documentoIdentificacion, Integer tipo) {
		super();
		this.idCuenta = idCuenta;
		this.noCuenta = noCuenta;
		this.documentoIdentificacion = documentoIdentificacion;
		this.tipo = tipo;
	}
	
	
	
	

}
