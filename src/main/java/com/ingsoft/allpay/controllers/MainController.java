package com.ingsoft.allpay.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
import com.ingsoft.allpay.model.Ciudadano;
import com.ingsoft.allpay.services.CurrensyService;
import com.ingsoft.allpay.services.RestCountries;

@Controller

public class MainController {

	@Autowired
	RestCountries restCountries;
	@Autowired
	CurrensyService currensyService;
	@Autowired
	MongoTemplate mongoTemplate;

	@RequestMapping("/")
	public String home(Model model) {

		return "index";
	}

	@RequestMapping("started")
	public String started(Model model) {
		
		return "started";
	}


	

	@RequestMapping("uploadvar")
	public String uploadvar(Model model) {
		return "uploadvar";
	}

	@RequestMapping(value = "/addCiudadano", method = RequestMethod.POST)
	public String addciudadno(@ModelAttribute Ciudadano ciudadano) {
		Ciudadano ciudadanos = ciudadano;
		mongoTemplate.save(ciudadanos);
		return "uploadvar";
	}

}
