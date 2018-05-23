package com.ingsoft.allpay.controllers;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ingsoft.allpay.dao.ResponseGeneric;
import com.ingsoft.allpay.model.Banco;
import com.ingsoft.allpay.model.CuentaBancaria;
import com.ingsoft.allpay.model.ServiciosPrestados;
import com.ingsoft.allpay.model.TransaccionBancaria;
import com.ingsoft.allpay.resultmodel.BancoResponse;
import com.ingsoft.allpay.resultmodel.ComprobarTransaccion;
import com.ingsoft.allpay.resultmodel.CuentaResponse;
import com.ingsoft.allpay.resultmodel.SaldosResponse;
import com.ingsoft.allpay.resultmodel.ServiciosPrestadosResult;
import com.ingsoft.allpay.services.BancoService;
import com.ingsoft.allpay.services.CuentaBancariaService;
import com.ingsoft.allpay.services.ServiciosPrestadosService;
import com.ingsoft.allpay.services.TransaccionBancariaService;

@RestController
@RequestMapping(value = "/bancoService")
public class BancoController {
	
	@Autowired BancoService bancoService;
	@Autowired CuentaBancariaService cuentaService;
	@Autowired TransaccionBancariaService transaccionService;
	@Autowired ServiciosPrestadosService serviciosPrestadosService;
	private static Logger logger = LoggerFactory.getLogger(BancoController.class);
	
	
	@GetMapping(value = "/getAllBancos")
	 public ResponseGeneric<BancoResponse> getServicios(){
		
		ResponseGeneric<BancoResponse> response = new ResponseGeneric<BancoResponse>();
		try
		{
			response.setResponse(bancoService.findAllBancos());			
			response.setCode("1");
			response.setMessage("Transaccion correcta");
			return response;
		}catch(Exception e)
		{
			response.setCode("0");
			response.setMessage("Error al obtener los bancos del sistema");
			logger.info("ERROR "+e);
			return response;
		}
	}
	
	@PostMapping(value ="/buscarCuentaPorNumero")
	public ResponseGeneric<CuentaResponse> getCuentaPorNumero(@RequestParam String numeroCuenta)
	{
		
		ResponseGeneric<CuentaResponse> response = new ResponseGeneric<CuentaResponse>();
		try
		{
			response.setResponse(cuentaService.findByNoCuenta(numeroCuenta));			
			response.setCode("1");
			response.setMessage("Transaccion correcta");
			return response;
		}catch(Exception e)
		{
			response.setCode("0");
			response.setMessage("Error al obtener la cuenta numero "+numeroCuenta);
			logger.info("ERROR "+e);
			return response;
		}
	}
	
	
	@PostMapping(value ="/buscarCuentaDocumento")
	public ResponseGeneric<CuentaResponse> getCuentaPorDocumento(@RequestParam String numeroDocumentoIdentificacion)
	{
		
		ResponseGeneric<CuentaResponse> response = new ResponseGeneric<CuentaResponse>();
		try
		{
			response.setResponse(cuentaService.findByNoDocumentoIdenti(numeroDocumentoIdentificacion));			
			response.setCode("1");
			response.setMessage("Transaccion correcta");
			return response;
		}catch(Exception e)
		{
			response.setCode("0");
			response.setMessage("Error al obtener la numero "+numeroDocumentoIdentificacion);
			logger.info("ERROR "+e);
			return response;
		}
	}
	
	@PostMapping(value = "/saldoCuenta")
	public SaldosResponse getSaldoCuenta(@RequestParam String numeroCuenta)
	{
		SaldosResponse response = new SaldosResponse();
		try
		{
			logger.info("saldo "+cuentaService.getSaldoCuenta(numeroCuenta).getSaldo());
			response.setSaldo(cuentaService.getSaldoCuenta(numeroCuenta).getSaldo());
			response.setCode("1");
			response.setMessage("Transaccion correcta");
			return response;
			
		}catch(Exception e)
		{
			logger.info("ERROR AL OBTENER EL SALDO DE LA CUENTA "+e);
			response.setMessage("Erro al obtener el saldo de la cuenta "+numeroCuenta);
			response.setCode("0");
			return response;
		
		}
	}
	
	
	@PostMapping(value = "/comprobarTransaccion")
	public ComprobarTransaccion comprobarTransaccion(@RequestParam String numeroCuenta, @RequestParam String montoDebitar)
	{
		ComprobarTransaccion response = new ComprobarTransaccion();
		try
		{
			Double saldo =cuentaService.getSaldoCuenta(numeroCuenta).getSaldo();
			Double debito = Double.parseDouble(montoDebitar);
			if(saldo-debito>0)
			{
				response.setEstado(true);
			}
			else
			{
				response.setEstado(false);
			}

			response.setCode("1");
			response.setMessage("Transaccion correcta");
			return response;
			
			
		}catch(Exception e)
		{
			logger.info("ERROR AL OBTENER EL SALDO DE LA CUENTA "+e);
			response.setMessage("Erro al obtener el saldo de la cuenta "+numeroCuenta);
			response.setCode("0");
			return response;
		
		}
	}
	
	@PostMapping(value = "/realizarTransaccion")
	public ComprobarTransaccion realizarTransaccion(@RequestParam String cuentaDebito, @RequestParam String nombre, @RequestParam String monto, 
			@RequestParam String idServicio)
	{
		ComprobarTransaccion response = new ComprobarTransaccion();
		try
		{
			Double saldo =cuentaService.getSaldoCuenta(cuentaDebito).getSaldo();
			Double debito = Double.parseDouble(monto);
			if(saldo-debito>0)
			{
				response.setEstado(true);
				TransaccionBancaria debitoT = new TransaccionBancaria();
				CuentaBancaria cuenta = cuentaService.findByCuenta(cuentaDebito);
				
				debitoT.setCuentaBancaria(cuenta);
				
				ServiciosPrestados serv = serviciosPrestadosService.findOne(Integer.parseInt(idServicio));
				
				debitoT.setDescripcion("Pago servicio "+serv.getNombreServicio());
				debitoT.setFecha(new Date());
				debitoT.setTipo("-1");
				debitoT.setValor(Float.parseFloat(monto));
				transaccionService.save(debitoT);
				
				TransaccionBancaria creditoT = new TransaccionBancaria();
				CuentaBancaria cuentaDep = cuentaService.findByCuenta(serv.getCuentaBancaria());
				
				
				creditoT.setCuentaBancaria(cuentaDep);	
				creditoT.setDescripcion("Pago servicio "+serv.getNombreServicio()+" a nombre de "+nombre);
				creditoT.setFecha(new Date());
				creditoT.setTipo("1");
				creditoT.setValor(Float.parseFloat(monto));
				transaccionService.save(creditoT);
				response.setCode("1");
				response.setMessage("Transaccion Realizada con exito");
				
				
			}
			else
			{
				response.setEstado(false);
				response.setCode("0");
				response.setMessage("No cuenta con los fondos necesarios");
			}

			
			
			return response;
			
			
		}catch(Exception e)
		{
			logger.info("ERROR AL OBTENER EL SALDO DE LA CUENTA "+e);
			response.setMessage("Erro al obtener el saldo de la cuenta "+cuentaDebito);
			response.setCode("0");
			return response;
		
		}
	}
	
	

}
