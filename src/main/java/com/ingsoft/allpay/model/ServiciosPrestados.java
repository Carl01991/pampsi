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
@Table(name ="servicios")
public class ServiciosPrestados {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_servicio")
	private Integer idServicio;
	@Column(name = "nombre_servicio")
	private String nombreServicio;
	@Column(name = "descripcion_servicio")
	private String descripcionServicio;
	@Column(name = "estado")
	private Integer estado;
	@Column(name = "tipo")
	private String tipo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonBackReference
	@JoinColumn(name = "id_departamento")
	private Departamento departamento;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy="servicios")
	@JsonManagedReference
	Set<DetalleServicio> servicioDetalle = new HashSet<DetalleServicio>();
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Integer getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}
	public String getNombreServicio() {
		return nombreServicio;
	}
	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}
	public String getDescripcionServicio() {
		return descripcionServicio;
	}
	public void setDescripcionServicio(String descripcionServicio) {
		this.descripcionServicio = descripcionServicio;
	}
	
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public Set<DetalleServicio> getServicioDetalle() {
		return servicioDetalle;
	}
	public void setServicioDetalle(Set<DetalleServicio> servicioDetalle) {
		this.servicioDetalle = servicioDetalle;
	}
	
	
	

}
