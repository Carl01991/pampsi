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
import com.ingsoft.allpay.resultmodel.ServiciosPrestadosResult;
import com.ingsoft.allpay.services.ServiciosPrestadosService;

@RestController
@RequestMapping(value = "/muniGuatemala")
public class ServiciosMuniGuateController {
	
	@Autowired ServiciosPrestadosService serviciosPrestadosService;
	
	@GetMapping(value = "/getqr")
	 public ResponseGeneric<ServiciosPrestadosResult> getServicios(){
		
		ResponseGeneric<ServiciosPrestadosResult> response = new ResponseGeneric<ServiciosPrestadosResult>();

		

		
		
		
		try
		{
			
			
			List<ServiciosPrestadosResult> result = new  ArrayList<ServiciosPrestadosResult>();

			for(ServiciosPrestados servicios : serviciosPrestadosService.findByDepartamentoIdDepartamentoAndTipo(1, "gua")) {
				
				ServiciosPrestadosResult serviciosResult = new ServiciosPrestadosResult();
				
				serviciosResult.setDescripcionServicio(servicios.getDescripcionServicio());
				serviciosResult.setEstado(servicios.getEstado());
				serviciosResult.setIdServicio(servicios.getIdServicio());
				serviciosResult.setNombreServicio(servicios.getNombreServicio());
				serviciosResult.setTipo(servicios.getTipo());
				
				result.add(serviciosResult);
			}
			response.setResponse(result);
			
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
