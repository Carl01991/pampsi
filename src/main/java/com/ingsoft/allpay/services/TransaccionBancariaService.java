package com.ingsoft.allpay.services;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaccionBancariaService extends JpaRepository<com.ingsoft.allpay.model.TransaccionBancaria, Serializable>{

}
