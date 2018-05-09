package com.ingsoft.allpay.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ingsoft.allpay.model.Departamento;
import com.ingsoft.allpay.model.ServiciosPrestados;

public interface ServiciosPrestadosService extends JpaRepository<ServiciosPrestados, Serializable>{
	
//	@Query("Select SV from ServiciosPrestados SV where SV.departamento.idDepartamento=?1 and SV.tipo=?2)")
	List<ServiciosPrestados> findByDepartamentoIdDepartamentoAndTipo(Integer departamento,String tipo);

}
