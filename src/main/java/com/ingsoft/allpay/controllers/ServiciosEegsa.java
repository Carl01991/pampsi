package com.ingsoft.allpay.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
import com.ingsoft.allpay.resultmodel.HistoricoGeneralPorCiudadano;
import com.ingsoft.allpay.resultmodel.HistoricoPorCiudadano;
import com.ingsoft.allpay.resultmodel.ServiciosPrestadosResult;
import com.ingsoft.allpay.services.DetalleServiciosService;
import com.ingsoft.allpay.services.HistoricoPorUsuarioService;
import com.ingsoft.allpay.services.HistoricoTarifasService;
import com.ingsoft.allpay.services.RegistroDePagosService;
import com.ingsoft.allpay.services.ServiciosPrestadosService;

@RestController
@RequestMapping(value = "/serviciosEegsa")
public class ServiciosEegsa {

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
	
	
	@GetMapping(value = "/getSaldoUsuario")
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
	public ResponseGenricValue registrarPago(@RequestParam String documentoCobro, @RequestParam String documentoIdentificacion, @RequestParam String valor){
		
		ResponseGenricValue response = new ResponseGenricValue();
		try
		{
			
			RegistroDePagos pago = new RegistroDePagos();
			pago.setDocumentoIdentificacion(documentoIdentificacion);
			pago.setIdHistoricoCobro(Integer.parseInt(documentoCobro));
			pago.setValor(Float.parseFloat(valor));
			pago.setFecha(new Date());
			HistorialCobros actual = historicoUsuario.findOne(Integer.parseInt(documentoCobro));
			logger.info("ID DE ACTUAL "+actual.getDetalleServicio().getIdDetalleServicio());
			List<HistorialCobros> anteriores = historicoUsuario.findExistAnterior(documentoIdentificacion, actual.getFecha(), actual.getDetalleServicio().getIdDetalleServicio());
			if(!anteriores.isEmpty())
			{
				response.setCode("0");
				response.setMessage("Existe un pago anterior que debe solventar antes de realizar esta transaccion");
			}
			else
			{
				registroPagosService.save(pago);
				
				HistorialCobros actualizar = historicoUsuario.findOne(Integer.parseInt(documentoCobro));
				actualizar.setPagado(1);
				historicoUsuario.save(actualizar);
				response.setCode("1");
				response.setMessage("Transaccion correcta");
			}
			
			return response;
		}catch(Exception e)
		{
			response.setCode("0");
			response.setMessage("Error al obtener servicios muni guate");
			logger.info("error ",e);
	
			return response;
			
		}
	}
	
}
