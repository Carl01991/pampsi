package com.ingsoft.allpay.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ingsoft.allpay.model.CuentaBancaria;
import com.ingsoft.allpay.resultmodel.CuentaResponse;
import com.ingsoft.allpay.resultmodel.SaldosResponse;

public interface CuentaBancariaService extends JpaRepository<CuentaBancaria, Serializable>{

	@Query("select new com.ingsoft.allpay.resultmodel.CuentaResponse(c.idCuenta,c.noCuenta,c.documentoIdentificacion,c.tipo)"
			+ " from CuentaBancaria c where c.noCuenta=?1")
	List<CuentaResponse> findByNoCuenta(String noCuenta);
	
	
	@Query("select new com.ingsoft.allpay.resultmodel.CuentaResponse(c.idCuenta,c.noCuenta,c.documentoIdentificacion,c.tipo)"
			+ " from CuentaBancaria c where c.documentoIdentificacion=?1")
	List<CuentaResponse> findByNoDocumentoIdenti(String documento);
	
	@Query("select new com.ingsoft.allpay.resultmodel.SaldosResponse(sum((t.valor*t.tipo)) as saldo) from CuentaBancaria c Inner join c.transaccionBancaria as t where c.noCuenta=?1")
	SaldosResponse getSaldoCuenta(String noCuenta);
	
	@Query("select c from CuentaBancaria c where c.noCuenta=?1")
	CuentaBancaria findByCuenta(String cuenta);
}

