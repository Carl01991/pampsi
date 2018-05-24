package com.ingsoft.allpay.model;

import java.util.Arrays;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "Ciudadano")
public class DpiModel {
	
	@Id
	private String Cui;
	@Field
	private String Nombre1;
	@Field
	private String Nombre2;
	@Field
	private String Apellido1;
	@Field
	private String Apellido2;
	@Field
	private String Genero;
	@Field
	private String EstadoCivil;
	@Field
	private byte[] Foto;
	@Field
	private String FechaNAc;
	@Field
	private String ApellidoCasada;
	@Field
	private String Limitaciones;
	@Field
	private String Nacionalidad;
	@Field
	private String PaisNAc;
	@Field
	private String SerialNumber;
	@Field
	private String cellPhone;
	@Field
	private String Email;
	@Field
	private String Departamento;
	@Field
	private String Municipio;	
	
	
	public String getCui() {
		return Cui;
	}
	public void setCui(String cui) {
		Cui = cui;
	}
	public String getNombre1() {
		return Nombre1;
	}
	public void setNombre1(String nombre1) {
		Nombre1 = nombre1;
	}
	public String getNombre2() {
		return Nombre2;
	}
	public void setNombre2(String nombre2) {
		Nombre2 = nombre2;
	}
	public String getApellido1() {
		return Apellido1;
	}
	public void setApellido1(String apellido1) {
		Apellido1 = apellido1;
	}
	public String getApellido2() {
		return Apellido2;
	}
	public void setApellido2(String apellido2) {
		Apellido2 = apellido2;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	public String getEstadoCivil() {
		return EstadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		EstadoCivil = estadoCivil;
	}
	public byte[] getFoto() {
		return Foto;
	}
	public void setFoto(byte[] foto) {
		Foto = foto;
	}
	public String getFechaNAc() {
		return FechaNAc;
	}
	public void setFechaNAc(String fechaNAc) {
		FechaNAc = fechaNAc;
	}
	public String getApellidoCasada() {
		return ApellidoCasada;
	}
	public void setApellidoCasada(String apellidoCasada) {
		ApellidoCasada = apellidoCasada;
	}
	public String getLimitaciones() {
		return Limitaciones;
	}
	public void setLimitaciones(String limitaciones) {
		Limitaciones = limitaciones;
	}
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
	public String getPaisNAc() {
		return PaisNAc;
	}
	public void setPaisNAc(String paisNAc) {
		PaisNAc = paisNAc;
	}
	public String getSerialNumber() {
		return SerialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDepartamento() {
		return Departamento;
	}
	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	public String getMunicipio() {
		return Municipio;
	}
	public void setMunicipio(String municipio) {
		Municipio = municipio;
	}
	@Override
	public String toString() {
		return "DpiModel [Cui=" + Cui + ", Nombre1=" + Nombre1 + ", Nombre2=" + Nombre2 + ", Apellido1=" + Apellido1
				+ ", Apellido2=" + Apellido2 + ", Genero=" + Genero + ", EstadoCivil=" + EstadoCivil + ", Foto="
				+ Arrays.toString(Foto) + ", FechaNAc=" + FechaNAc + ", ApellidoCasada=" + ApellidoCasada
				+ ", Limitaciones=" + Limitaciones + ", Nacionalidad=" + Nacionalidad + ", PaisNAc=" + PaisNAc
				+ ", SerialNumber=" + SerialNumber + ", cellPhone=" + cellPhone + ", Email=" + Email + ", Departamento="
				+ Departamento + ", Municipio=" + Municipio + "]";
	}
	
	
	
	
	
	
	
	
}
