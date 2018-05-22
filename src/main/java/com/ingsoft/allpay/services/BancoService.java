package com.ingsoft.allpay.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ingsoft.allpay.model.Banco;
import com.ingsoft.allpay.resultmodel.BancoResponse;

public interface BancoService extends JpaRepository<Banco, Serializable>{

	@Query("select new com.ingsoft.allpay.resultmodel.BancoResponse(b.id,b.nombre) from Banco b")
	List<BancoResponse> findAllBancos();
}
