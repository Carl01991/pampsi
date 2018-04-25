
package com.ingsoft.allpay.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ingsoft.allpay.model.Municipalidad;
import com.ingsoft.allpay.model.Municipio;

public interface MunicipalidadService extends JpaRepository<Municipalidad,Serializable>{

	List<Municipalidad> findByMunicipio(Municipio idMunicipio);

}
