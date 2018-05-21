package com.ingsoft.allpay.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ingsoft.allpay.model.HistorialCobros;
import com.ingsoft.allpay.resultmodel.HistoricoPorCiudadano;

public interface HistoricoPorUsuarioService extends JpaRepository<HistorialCobros, Serializable>{
//	@Query("select new com.ingsoft.allpay.resultmodel.HistoricoPorCiudadano(hc.idHistoricoCobros as id, hc.fecha as fecha, (hc.valor*ht.tarifa) as valorPagar) "
//			+ " from HistorialCobros hc inner join hc.detalleServicio.tarifas ht where ht.estado=1 and ht.periodo=YEAR(CURRENT_DATE()) "
//			+ " and ht.detalleServicio.idDetalleServicio=?1 "
//			+ " and hc.pagado=0 and hc.fecha<=CURRENT_DATE() and hc.documentoIdentificacion=?2")
	@Query("select new com.ingsoft.allpay.resultmodel.HistoricoPorCiudadano(hc.idHistoricoCobros as docuemntoDeCobro, hc.fecha as fecha, hc.valor as valorPagar) "
			+ " from HistorialCobros hc where hc.pagado=0 and hc.fecha<=CURRENT_DATE() and hc.detalleServicio.idDetalleServicio=?1 and hc.documentoIdentificacion=?2")
	List<HistoricoPorCiudadano> findByHistoricoUser(Integer idSerivicio, String documentoIdentificacion);

}
