package com.ingsoft.allpay.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name ="banco")
public class Banco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_banco")
	private Integer Banco;
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="banco")
	@JsonManagedReference
	Set<CuentaBancaria> cuentasBancarias = new HashSet<CuentaBancaria>();
	
	

	public Banco(Integer banco, String nombre) {
		super();
		Banco = banco;
		this.nombre = nombre;
	}

	public Integer getBanco() {
		return Banco;
	}

	public void setBanco(Integer banco) {
		Banco = banco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<CuentaBancaria> getCuentasBancarias() {
		return cuentasBancarias;
	}

	public void setCuentasBancarias(Set<CuentaBancaria> cuentasBancarias) {
		this.cuentasBancarias = cuentasBancarias;
	}
	
	
	
	

}
