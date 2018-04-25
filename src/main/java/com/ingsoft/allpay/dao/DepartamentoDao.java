package com.ingsoft.allpay.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.ingsoft.allpay.model.Departamento;
import com.ingsoft.allpay.services.DepartamentoService;

public class DepartamentoDao implements DepartamentoService{

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInBatch(Iterable<Departamento> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Departamento> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Departamento> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Departamento> findAll(Iterable<Serializable> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Departamento> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Departamento> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Departamento getOne(Serializable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Departamento> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Departamento> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Departamento> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Departamento> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Departamento findOne(Serializable id) {
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
	public void delete(Departamento entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Departamento> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Departamento> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Departamento> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Departamento> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Departamento> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
