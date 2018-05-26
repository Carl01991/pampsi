package com.ingsoft.allpay.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ingsoft.allpay.model.DetalleServicio;
import com.ingsoft.allpay.resultmodel.DetalleServiciosResultmodel;

public interface DetalleServiciosService extends JpaRepository<DetalleServicio, Serializable>{
	
	@Query("select new com.ingsoft.allpay.resultmodel.DetalleServiciosResultmodel(ds.idDetalleServicio, ds.nombre, ds.estado)"
			+ " from DetalleServicio ds join ds.cobros hr where ds.servicios.idServicio=?1 and ds.estado = 1 and hr.documentoIdentificacion =?2 group by ds.idDetalleServicio")
	List<DetalleServiciosResultmodel> findByServicio(Integer idServicio, String cui);

}
