package com.ingsoft.allpay.controllers;

import java.sql.Date;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ingsoft.allpay.dao.ResponseGenricValue;
import com.ingsoft.allpay.model.Banco;
import com.ingsoft.allpay.model.CuentaBancaria;
import com.ingsoft.allpay.model.DetalleServicio;
import com.ingsoft.allpay.model.HistorialCobros;
import com.ingsoft.allpay.model.TransaccionBancaria;
import com.ingsoft.allpay.resultmodel.DetalleServiciosResultmodel;
import com.ingsoft.allpay.resultmodel.ResponseGenericBoolean;
import com.ingsoft.allpay.services.BancoService;
import com.ingsoft.allpay.services.CuentaBancariaService;
import com.ingsoft.allpay.services.DetalleServiciosService;
import com.ingsoft.allpay.services.HistoricoPorUsuarioService;
import com.ingsoft.allpay.services.TransaccionBancariaService;

@RestController
@RequestMapping(value = "/verificacion")
public class RegistroVerificacionController {
	
	private static Logger logger = LoggerFactory.getLogger(RegistroVerificacionController.class);
	@Autowired DetalleServiciosService detalleServiciosService;
	@Autowired HistoricoPorUsuarioService historicoUsuario;
	@Autowired BancoService bancoService;
	@Autowired CuentaBancariaService cuentaService;
	@Autowired TransaccionBancariaService transaccionService;
	
	@GetMapping("/verificarRegistros")
	public ResponseGenericBoolean verificarRegistroAsociados(@RequestParam String cui,@RequestParam String nombre)
	{
		ResponseGenericBoolean response = new ResponseGenericBoolean();
		
		try
		{
//			verificando si existe registros de cobros
//			=========================== MUNI GUATE ======================================
			List<DetalleServiciosResultmodel> muniG= detalleServiciosService.findByServicio("gua",cui);
//			=========================== MUNI MIXCO ======================================
			List<DetalleServiciosResultmodel> muniMix= detalleServiciosService.findByServicio("mix",cui);
//			=========================== EEGSA ======================================
			List<DetalleServiciosResultmodel> eegsa= detalleServiciosService.findByServicio("eegsa",cui);
			boolean bandera =true;
			if(muniG.isEmpty())
			{
				if(muniMix.isEmpty())
				{
					if(eegsa.isEmpty())
					{
						bandera = false;
					}
					else {
						bandera = true;
					}
				}
				else {
					bandera = true;
				}
			}
			
			if(!bandera)
			{
				Integer numRegCobro = (int) (Math.random() * (3 - 1) + 1);
				logger.info("RAMDOM REGISTROS COBROS "+numRegCobro);
				for(Integer i=1; i<=numRegCobro; i++)
				{
					HistorialCobros h = new HistorialCobros();
					Integer idDetalle = (int) (Math.random() * (5 - 1) + 1);
					logger.info("DETALLE SERVICIO "+idDetalle);
					DetalleServicio detalle = detalleServiciosService.findOne(idDetalle);
					h.setDetalleServicio(detalle);
					h.setDocumentoIdentificacion(cui);
					h.setPagado(0);
					Integer valor = (int) (Math.random() * (500 - 150) + 150);
					h.setValor(Double.parseDouble(valor.toString()));
				
					
					Random  rnd = null;
					Date    dt;
					long    ms;
					ms = -946771200000L + (Math.abs(rnd.nextLong()) % (7L * 365 * 24 * 60 * 60 * 1000));

					// Construct a date
					dt = new Date(ms);
					h.setFecha(dt);
					historicoUsuario.save(h);
				
				}
				
				Long cantidad = bancoService.count();
				Integer cantidadBancos = Integer.parseInt(cantidad.toString());
				numRegCobro = (int) (Math.random() * (cantidadBancos - 1) + 1);
				CuentaBancaria cuenta = new CuentaBancaria();
				Integer digitos1 = (int) (Math.random() * (500 - 100) + 100);
				Integer digitos2 = (int) (Math.random() * (500 - 100) + 100);
				String numeroCuenta = "000-"+digitos1+"-"+digitos2;
				cuenta.setNoCuenta(numeroCuenta);
				Banco banco = bancoService.findOne(numRegCobro);
				cuenta.setBanco(banco);
				cuenta.setDocumentoIdentificacion(cui);
				cuenta.setTipo(1);
				cuenta =cuentaService.save(cuenta);
				
				TransaccionBancaria tran = new TransaccionBancaria();
				tran.setCuentaBancaria(cuenta);
				tran.setDescripcion("DEPOSTIO INICIAL ");
				Date hoy = new Date(0);
				tran.setFecha(hoy);
				tran.setTipo("1");
				Float saldo =(float) (Math.random() * (5000 - 1500) + 1500);
				tran.setValor(saldo);
				transaccionService.save(tran);
				
				
			}
			
			response.setResultado(bandera);
			response.setCode("1");
			response.setMessage("SE CREAON REGISTROS");
			return response;
		}catch(Exception e)
		{
			logger.info("ERRIR AL GENERAR REGISTROS ALEATORIOS O VERIFICAR ACCIONES"+e);
			response.setCode("0");
			response.setMessage("Error al verificar servicios asociados RegistroVerificacionController- verificarRegistroAsociados"+e);
			response.setResultado(false);
			return response;
		}
		
	}

}
