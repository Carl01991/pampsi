package com.ingsoft.allpay.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.ingsoft.allpay.model.ServiciosPrestados;
import com.ingsoft.allpay.services.ServiciosPrestadosService;

public class ServiciosPrestadosDao implements ServiciosPrestadosService{

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInBatch(Iterable<ServiciosPrestados> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ServiciosPrestados> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ServiciosPrestados> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ServiciosPrestados> findAll(Iterable<Serializable> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ServiciosPrestados> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ServiciosPrestados> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServiciosPrestados getOne(Serializable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ServiciosPrestados> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ServiciosPrestados> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<ServiciosPrestados> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ServiciosPrestados> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiciosPrestados findOne(Serializable id) {
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
	public void delete(ServiciosPrestados entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends ServiciosPrestados> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends ServiciosPrestados> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ServiciosPrestados> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ServiciosPrestados> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends ServiciosPrestados> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ServiciosPrestados> findByDepartamentoIdDepartamentoAndTipo(Integer departamento, String tipo) {
		// TODO Auto-generated method stub
		return null;
	}

}
