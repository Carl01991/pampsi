package com.ingsoft.allpay.services;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ingsoft.allpay.model.Departamento;
import com.ingsoft.allpay.model.Municipio;

public interface MunicipioService extends JpaRepository<Municipio, Serializable>{

	
	Municipio findByDepartamento(Departamento idDepartamento);
	
	
}
