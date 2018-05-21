package com.ingsoft.allpay.services;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ingsoft.allpay.model.RegistroDePagos;

public interface RegistroDePagosService extends JpaRepository<RegistroDePagos, Serializable>{

}
