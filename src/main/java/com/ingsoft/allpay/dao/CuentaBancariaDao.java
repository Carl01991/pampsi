package com.ingsoft.allpay.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.ingsoft.allpay.model.CuentaBancaria;
import com.ingsoft.allpay.resultmodel.CuentaResponse;
import com.ingsoft.allpay.resultmodel.SaldosResponse;
import com.ingsoft.allpay.services.CuentaBancariaService;

public class CuentaBancariaDao implements CuentaBancariaService{

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInBatch(Iterable<CuentaBancaria> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CuentaBancaria> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CuentaBancaria> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CuentaBancaria> findAll(Iterable<Serializable> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CuentaBancaria> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CuentaBancaria> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CuentaBancaria getOne(Serializable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CuentaBancaria> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CuentaBancaria> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<CuentaBancaria> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CuentaBancaria> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CuentaBancaria findOne(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(CuentaBancaria entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends CuentaBancaria> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends CuentaBancaria> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CuentaBancaria> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CuentaBancaria> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends CuentaBancaria> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<CuentaResponse> findByNoCuenta(String noCuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CuentaResponse> findByNoDocumentoIdenti(String documento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SaldosResponse getSaldoCuenta(String noCuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CuentaBancaria findByCuenta(String cuenta) {
		// TODO Auto-generated method stub
		return null;
	}

}
