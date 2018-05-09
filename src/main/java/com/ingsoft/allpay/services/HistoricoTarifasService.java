package com.ingsoft.allpay.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ingsoft.allpay.model.HistoricoTarifas;
import com.ingsoft.allpay.resultmodel.HistoricoTarifasResultmodel;

public interface HistoricoTarifasService extends JpaRepository<HistoricoTarifas, Serializable>{
	
	@Query("select new com.ingsoft.allpay.resultmodel.HistoricoTarifasResultmodel(ht.idHistoricoTarifa,ht.periodo,ht.descripcion,ht.tarifa,ht.estado)"
			+ " from HistoricoTarifas ht where ht.estado=1 and ht.periodo=YEAR(CURRENT_DATE()) and ht.detalleServicio.idDetalleServicio=?1")
	List<HistoricoTarifasResultmodel> findByPeriodoActualAndIdServicio(Integer id);

}
