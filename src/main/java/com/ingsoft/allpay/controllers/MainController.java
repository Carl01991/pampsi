package com.ingsoft.allpay.controllers;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

import javax.imageio.ImageIO;
import javax.smartcardio.CardException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ingsoft.allpay.methods.ImageGenerator;
import com.ingsoft.allpay.model.Ciudadano;
import com.ingsoft.allpay.model.DpiModel;
import com.ingsoft.allpay.services.CurrensyService;
import com.ingsoft.allpay.services.RestCountries;
import com.mysql.jdbc.util.Base64Decoder;
import com.sltech.dpi.exception.DPIConnectException;
import com.sltech.dpi.exception.DPIException;
import com.sltech.dpi.smartcard.DatosdpiTO;
import com.sltech.dpi.smartcard.SmartCardDPIReader;
import com.sltech.dpi.util.CardUtils;

@Controller

public class MainController {

	@Autowired
	RestCountries restCountries;
	@Autowired
	CurrensyService currensyService;
	@Autowired
	MongoTemplate mongoTemplate;
	@Autowired
	ImageGenerator imageGenerator;

	@RequestMapping("/")
	public String home(Model model) {

		return "index";
	}

	@RequestMapping("dpidetector")
	public String started() {
		return "dpidetector";
	}

	@RequestMapping("uploadvar")
	public String uploadvar(Model model) {
		return "uploadvar";
	}

	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/adduser")
	public String addciudadno(Model model) throws CardException, DPIConnectException, DPIException, IOException {
		com.ingsoft.allpay.methods.SCardConexion sc = new com.ingsoft.allpay.methods.SCardConexion();
		DatosdpiTO dpi = getDPI(sc);
		DpiModel dpiResult = new DpiModel();

		dpiResult.setApellido1(dpi.getApellido1());
		dpiResult.setApellido2(dpi.getApellido2());
		dpiResult.setApellidoCasada(dpi.getApellidoDeCasada()); 
		dpiResult.setCui(dpi.getCui());
		dpiResult.setEstadoCivil(dpi.getEstadoCivil());
		dpiResult.setFechaNAc(dpi.getNacimientoFecha());
		dpiResult.setGenero(dpi.getGenero());
		dpiResult.setLimitaciones(dpi.getLimitacionesFisicas());
		dpiResult.setNacionalidad(dpi.getNacionalidad());
		dpiResult.setNombre1(dpi.getNombre1());
		dpiResult.setNombre2(dpi.getNombre2());
		dpiResult.setPaisNAc(dpi.getNacimientoPais());
		dpiResult.setSerialNumber(dpi.getSerialNumber());
		dpiResult.setDepartamento(dpi.getCedulaDepartamento());
		dpiResult.setMunicipio(dpi.getCedulaMunicipio());
		model.addAttribute("dpi", dpiResult);
		 
		String base64Encoded = Base64.getEncoder().encodeToString(dpi.getFoto());

		
	
		model.addAttribute("image", base64Encoded);
		System.out.println(base64Encoded);
		return "started";
	}

	private DatosdpiTO getDPI(com.ingsoft.allpay.methods.SCardConexion sc)
			throws CardException, DPIConnectException, DPIException, IOException {
		System.out.println("Leyendo esta maravlla");
		CardUtils cardUtils;
		long startTime = System.currentTimeMillis();
		System.out.println(CardUtils.checkATR(sc.connect(0, "*").getBytes()));
		SmartCardDPIReader smartDPI = new SmartCardDPIReader(sc.terminals().get(0));
		DatosdpiTO dpi;

		dpi = smartDPI.readAllData();
		smartDPI.readFingerPrintsEnrolled();
		return dpi;

	}

}
