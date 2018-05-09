package com.ingsoft.allpay.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ingsoft.allpay.model.Departamento;
import com.ingsoft.allpay.model.ServiciosPrestados;
import com.ingsoft.allpay.resultmodel.ServiciosPrestadosResult;

public interface ServiciosPrestadosService extends JpaRepository<ServiciosPrestados, Serializable>{
	
	@Query("Select new com.ingsoft.allpay.resultmodel.ServiciosPrestadosResult(sv.idServicio, sv.nombreServicio,"
			+ "sv.descripcionServicio, sv.estado, sv.tipo)"
			+ " from ServiciosPrestados sv where sv.departamento.idDepartamento=?1 and sv.tipo=?2")
	List<ServiciosPrestadosResult> findByDepartamentoIdDepartamentoAndTipo(Integer departamento,String tipo);

}
