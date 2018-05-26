package com.ingsoft.allpay.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ingsoft.allpay.model.Departamento;
import com.ingsoft.allpay.model.ServiciosPrestados;
import com.ingsoft.allpay.resultmodel.ServiciosPrestadosResult;

public interface ServiciosPrestadosService extends JpaRepository<ServiciosPrestados, Serializable>{
	
	
	@Query("Select new com.ingsoft.allpay.resultmodel.ServiciosPrestadosResult(dt.idDetalleServicio as idServicio, dt.nombre,"
			+ "dt.estado, dt.tipo)"
			+ " from DetalleServicio dt where dt.tipo=?1")
	List<ServiciosPrestadosResult> findByDepartamentoIdDepartamentoAndTipo(String tipo); 

}
