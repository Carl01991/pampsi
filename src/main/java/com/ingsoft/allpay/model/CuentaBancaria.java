package com.ingsoft.allpay.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "cuenta_bancaria")
public class CuentaBancaria {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_cuenta")
	private Integer idCuenta;
	@Column(name="no_cuenta")
	private String noCuenta;
	@Column(name ="documento_identificacion")
	private String documentoIdentificacion;
	@Column(name ="tipo")
	private Integer tipo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name="id_banco")
	private Banco banco;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="cuentaBancaria")
	@JsonManagedReference
	Set<TransaccionBancaria> transaccionBancaria = new HashSet<TransaccionBancaria>();

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

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Integer getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Integer idCuenta) {
		this.idCuenta = idCuenta;
	}

	public Set<TransaccionBancaria> getTransaccionBancaria() {
		return transaccionBancaria;
	}

	public void setTransaccionBancaria(Set<TransaccionBancaria> transaccionBancaria) {
		this.transaccionBancaria = transaccionBancaria;
	}


	
	
}
