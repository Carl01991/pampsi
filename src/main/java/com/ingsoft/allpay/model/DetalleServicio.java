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
@Table(name = "detalle_servicio")
public class DetalleServicio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_detalle_servicio")
	private Integer idDetalleServicio;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "tipo")
	private String tipo;
	@Column(name = "estado")
	private Integer estado;
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonBackReference
	@JoinColumn(name="id_servicio")
	private ServiciosPrestados servicios;
	
	@JsonManagedReference
	@OneToMany(fetch = FetchType.EAGER, mappedBy="detalleServicio")
	Set<HistoricoTarifas> tarifas = new HashSet<HistoricoTarifas>();
	
	@JsonManagedReference
	@OneToMany(fetch = FetchType.EAGER, mappedBy="detalleServicio")
	Set<HistorialCobros> cobros = new HashSet<HistorialCobros>();
	
	
	
	
	public Set<HistorialCobros> getCobros() {
		return cobros;
	}
	public void setCobros(Set<HistorialCobros> cobros) {
		this.cobros = cobros;
	}
	public Set<HistoricoTarifas> getTarifas() {
		return tarifas;
	}
	public void setTarifas(Set<HistoricoTarifas> tarifas) {
		this.tarifas = tarifas;
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
	public ServiciosPrestados getServicios() {
		return servicios;
	}
	public void setServicios(ServiciosPrestados servicios) {
		this.servicios = servicios;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	
	
	
	

}