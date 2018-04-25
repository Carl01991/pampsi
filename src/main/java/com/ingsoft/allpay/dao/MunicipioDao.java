package com.ingsoft.allpay.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.ingsoft.allpay.model.Departamento;
import com.ingsoft.allpay.model.Municipio;
import com.ingsoft.allpay.services.MunicipioService;

public class MunicipioDao implements MunicipioService{

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInBatch(Iterable<Municipio> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Municipio> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Municipio> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Municipio> findAll(Iterable<Serializable> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Municipio> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Municipio> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Municipio getOne(Serializable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Municipio> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Municipio> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Municipio> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Municipio> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Municipio findOne(Serializable id) {
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
	public void delete(Municipio entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Municipio> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Municipio> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Municipio> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Municipio> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Municipio> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Municipio findByDepartamento(Departamento idDepartamento) {
		// TODO Auto-generated method stub
		return null;
	}

}
