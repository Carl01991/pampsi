package com.ingsoft.allpay.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ingsoft.allpay.dao.ResponseGeneric;
import com.ingsoft.allpay.dao.ResponseGenricValue;
import com.ingsoft.allpay.model.HistorialCobros;
import com.ingsoft.allpay.model.RegistroDePagos;
import com.ingsoft.allpay.model.ServiciosPrestados;
import com.ingsoft.allpay.resultmodel.DetalleServiciosResultmodel;
import com.ingsoft.allpay.resultmodel.HistoricoGeneralPorCiudadano;
import com.ingsoft.allpay.resultmodel.HistoricoPorCiudadano;
import com.ingsoft.allpay.resultmodel.HistoricoTarifasResultmodel;
import com.ingsoft.allpay.resultmodel.ServiciosPrestadosResult;
import com.ingsoft.allpay.services.DetalleServiciosService;
import com.ingsoft.allpay.services.HistoricoPorUsuarioService;
import com.ingsoft.allpay.services.HistoricoTarifasService;
import com.ingsoft.allpay.services.RegistroDePagosService;
import com.ingsoft.allpay.services.ServiciosPrestadosService;


@RestController
@RequestMapping(value = "/muniMixco")
public class ServiciosMuniMixcoController {
	
	private static Logger logger = LoggerFactory.getLogger(ServiciosMuniMixcoController.class);
	@Autowired ServiciosPrestadosService serviciosPrestadosService;
	@Autowired DetalleServiciosService detalleServiciosService;
	@Autowired HistoricoTarifasService historicoTarifasService;
	@Autowired HistoricoPorUsuarioService historicoUsuario;
	@Autowired RegistroDePagosService registroPagosService;
	
	@GetMapping(value = "/getServicio")
	 public ResponseGeneric<ServiciosPrestadosResult> getServicios(){
		
		ResponseGeneric<ServiciosPrestadosResult> response = new ResponseGeneric<ServiciosPrestadosResult>();
		try
		{
			response.setResponse(serviciosPrestadosService.findByDepartamentoIdDepartamentoAndTipo(1, "mix"));;			
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
	
	@PostMapping(value = "/getSaldoUsuario")
	public ResponseGeneric<HistoricoGeneralPorCiudadano> getSaldoUsuario(@RequestParam String idServicio, @RequestParam String documento){
		
		ResponseGeneric<HistoricoGeneralPorCiudadano> response = new ResponseGeneric<HistoricoGeneralPorCiudadano>();
		try
		{
			Double total =(double) 0;
			List<HistoricoPorCiudadano> historico = historicoUsuario.findByHistoricoUser(Integer.parseInt(idServicio), documento);
			for(HistoricoPorCiudadano h: historico)
			{
				total=(Double) (total+h.getValorPagar());
			}
			HistoricoGeneralPorCiudadano r = new HistoricoGeneralPorCiudadano();
			r.setHistorico(historico);
			r.setTotal(total);
			List<HistoricoGeneralPorCiudadano> array = new ArrayList<HistoricoGeneralPorCiudadano>();
			array.add(r);
			response.setResponse(array);
			response.setCode("1");
			response.setMessage("Transaccion correcta");
			return response;
		}catch(Exception e)
		{
			response.setCode("0");
			response.setMessage("Error al obtener servicios muni guate");
			logger.info("error "+e);
	
			return response;
			
		}
	}
	
	@PostMapping(value = "/savePago")
	public ResponseGenricValue registrarPago(@RequestParam String documentoCobro, @RequestParam String documento, @RequestParam String valor){
		
		ResponseGenricValue response = new ResponseGenricValue();
		try
		{
			Double total =(double) 0;
			RegistroDePagos pago = new RegistroDePagos();
			pago.setDocumentoIdentificacion(documento);
			pago.setIdHistoricoCobro(Integer.parseInt(documentoCobro));
			pago.setValor(Float.parseFloat(valor));
			pago.setFecha(new Date());
			registroPagosService.save(pago);
			
			HistorialCobros actualizar = historicoUsuario.findOne(Integer.parseInt(documentoCobro));
			actualizar.setPagado(1);
			historicoUsuario.save(actualizar);
			response.setCode("1");
			response.setMessage("Transaccion correcta");
			return response;
		}catch(Exception e)
		{
			response.setCode("0");
			response.setMessage("Error al obtener servicios muni guate");
			logger.info("error "+e);
	
			return response;
			
		}
	}

}
