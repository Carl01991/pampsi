package com.ingsoft.allpay.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ingsoft.allpay.model.Municipalidad;
import com.ingsoft.allpay.services.MunicipalidadService;


@RestController
public class MunicipalidadController {

	private static Logger logger = LoggerFactory.getLogger(MunicipalidadController.class);
	@Autowired MunicipalidadService municipalidadService;
	
	@PostMapping(value = "listaServicios")
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
}
