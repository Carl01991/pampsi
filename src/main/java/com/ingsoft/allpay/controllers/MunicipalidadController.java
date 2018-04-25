package com.ingsoft.allpay.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ingsoft.allpay.model.Departamento;
import com.ingsoft.allpay.model.Municipalidad;
import com.ingsoft.allpay.model.Municipio;
import com.ingsoft.allpay.services.DepartamentoService;
import com.ingsoft.allpay.services.MunicipalidadService;
import com.ingsoft.allpay.services.MunicipioService;


@RestController
public class MunicipalidadController {

	private static Logger logger = LoggerFactory.getLogger(MunicipalidadController.class);
	@Autowired MunicipalidadService municipalidadService;
	@Autowired DepartamentoService departamentoService;
	@Autowired MunicipioService municipioService;
	
	@GetMapping(value = "listaServicios")
	public List<Municipalidad> getAllMunicipalidades()
	{
		List<Municipalidad> response = new ArrayList<Municipalidad>();
		try
		{
			response = municipalidadService.findAll();
		}catch(Exception e)
		{
			logger.info("Error en metod de consulta de municipalidades Controller"+e);
		}
		return response;
		
	}
	@GetMapping(value = "listaDepartamento")
	public List<Departamento> getAllDepartamentos()
	{
		List<Departamento> response = new ArrayList<Departamento>();
		try {
			
			response = departamentoService.findAll();
			return response;
		}catch(Exception e )
		{
			logger.info("Eror en metodo de consulta de municipalidades"+e);
			return null;
		}
	}
	
	
	@GetMapping(value = "listaMunicipios")
	public List<Municipio> getAllMunicipio()
	{
		List<Municipio> response = new ArrayList<Municipio>();
		try {
			
			response = municipioService.findAll();
			return response;
		}catch(Exception e)
		{
			
			logger.info("Error al consultar municipios all "+e);
			return null;
		}
	
	}
	@GetMapping(value = "getMunicipiosByIdDepartamento")
	public Municipio getMunicipioByDepartament(@RequestParam String idDepartamento)
	{
		Municipio response = new Municipio();
		try {
			Departamento dep = new Departamento();
			dep.setIdDepartamento(Integer.parseInt(idDepartamento));
			response = municipioService.findByDepartamento(dep);
			
			return response;
		}catch(Exception e)
		{
			logger.info("Error al obtener municipios del departmento "+idDepartamento);
			logger.info("Eror "+e);
			return null;
		}
		
	}
	@GetMapping(value = "getMunicipalidadesByIdMunicipio")
	public List<Municipalidad> getMunicipalidadesByMunicipio(@RequestParam String idMunicipio)
	{
		List<Municipalidad> response = new ArrayList<Municipalidad>();
		try {
			Municipio mun = new Municipio();
			mun.setIdMunicipio(Integer.parseInt(idMunicipio));
			response = municipalidadService.findByMunicipio(mun);
			
			return response;
		}catch(Exception e)
		{
			logger.info("Eror al obtener las municipalidades del municipio "+idMunicipio);
			return null;
		}
	}
	
	
	
	
}
