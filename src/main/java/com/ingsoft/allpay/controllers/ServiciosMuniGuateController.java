package com.ingsoft.allpay.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ingsoft.allpay.dao.ResponseGeneric;
import com.ingsoft.allpay.model.ServiciosPrestados;
import com.ingsoft.allpay.resultmodel.DetalleServiciosResultmodel;
import com.ingsoft.allpay.resultmodel.HistoricoTarifasResultmodel;
import com.ingsoft.allpay.resultmodel.ServiciosPrestadosResult;
import com.ingsoft.allpay.services.DetalleServiciosService;
import com.ingsoft.allpay.services.HistoricoTarifasService;
import com.ingsoft.allpay.services.ServiciosPrestadosService;

@RestController
@RequestMapping(value = "/muniGuatemala")
public class ServiciosMuniGuateController {
	
	@Autowired ServiciosPrestadosService serviciosPrestadosService;
	@Autowired DetalleServiciosService detalleServiciosService;
	@Autowired HistoricoTarifasService historicoTarifasService;
	
	@GetMapping(value = "/getServicio")
	 public ResponseGeneric<ServiciosPrestadosResult> getServicios(){
		
		ResponseGeneric<ServiciosPrestadosResult> response = new ResponseGeneric<ServiciosPrestadosResult>();
		try
		{
			response.setResponse(serviciosPrestadosService.findByDepartamentoIdDepartamentoAndTipo(1, "gua"));;			
			response.setCode("1");
			response.setMessage("Transaccion correcta");
			return response;
		}catch(Exception e)
		{
			response.setCode("0");
			response.setMessage("Error al obtener servicios muni guate");
			return response;
		}
	}
	@GetMapping(value = "/getListaServicios")
	public ResponseGeneric<DetalleServiciosResultmodel> getListServicios(){
		
		ResponseGeneric<DetalleServiciosResultmodel> response = new ResponseGeneric<DetalleServiciosResultmodel>();
		try
		{
			response.setResponse(detalleServiciosService.findByServicio(1));
			response.setCode("1");
			response.setMessage("Transaccion correcta");
			return response;
		}catch(Exception e)
		{
			response.setCode("0");
			response.setMessage("Error al obtener servicios muni guate");
			return response;
			
		}
	}
	@GetMapping(value = "/getTarifaActivaServicio")
	public ResponseGeneric<HistoricoTarifasResultmodel> getListaTarifasActivas(@RequestParam String idServicio){
		
		ResponseGeneric<HistoricoTarifasResultmodel> response = new ResponseGeneric<HistoricoTarifasResultmodel>();
		try
		{
			Integer id = Integer.parseInt(idServicio);
			response.setResponse(historicoTarifasService.findByPeriodoActualAndIdServicio(id));
			response.setCode("1");
			response.setMessage("Transaccion correcta");
			return response;
		}catch(Exception e)
		{
			response.setCode("0");
			response.setMessage("Error al obtener servicios muni guate");
			return response;
			
		}
	}
	

}
