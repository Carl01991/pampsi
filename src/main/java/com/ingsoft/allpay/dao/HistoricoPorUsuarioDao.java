package com.ingsoft.allpay.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.ingsoft.allpay.model.HistorialCobros;
import com.ingsoft.allpay.resultmodel.HistoricoPorCiudadano;
import com.ingsoft.allpay.services.HistoricoPorUsuarioService;

public class HistoricoPorUsuarioDao implements HistoricoPorUsuarioService{

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInBatch(Iterable<HistorialCobros> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<HistorialCobros> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HistorialCobros> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HistorialCobros> findAll(Iterable<Serializable> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends HistorialCobros> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends HistorialCobros> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HistorialCobros getOne(Serializable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends HistorialCobros> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends HistorialCobros> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<HistorialCobros> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends HistorialCobros> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HistorialCobros findOne(Serializable id) {
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
	public void delete(HistorialCobros entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends HistorialCobros> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends HistorialCobros> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends HistorialCobros> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends HistorialCobros> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends HistorialCobros> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<HistoricoPorCiudadano> findByHistoricoUser(Integer idSerivicio, String documentoIdentificacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HistorialCobros> findExistAnterior(String documentoIdentificacion, Date fecha, Integer idServicio) {
		// TODO Auto-generated method stub
		return null;
	}

}
