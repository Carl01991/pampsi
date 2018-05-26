package com.ingsoft.allpay.controllers;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.smartcardio.CardException;
import javax.smartcardio.CardTerminal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.ingsoft.allpay.model.DpiModel;
import com.sltech.dpi.exception.DPIConnectException;
import com.sltech.dpi.exception.DPIException;
import com.sltech.dpi.smartcard.DatosdpiTO;
import com.sltech.dpi.smartcard.SmartCardDPIReader;
import com.sltech.dpi.util.CardUtils;

import groovyjarjarcommonscli.ParseException;

@RestController
public class WsController {
	
    
    @GetMapping(value = "dpiConsult")  
    public DpiModel  map(@RequestParam String cui) throws ParseException, IOException {
    	DpiModel dpi = null; 	
        return dpi;
    	
    	
    	
    
    }
    
    
    @PostMapping(value = "dpidetector")  
    public String sib() throws ParseException, IOException, CardException, DPIConnectException, DPIException {
	   	  com.ingsoft.allpay.methods.SCardConexion sc = new com.ingsoft.allpay.methods.SCardConexion();
	   	CardTerminal terminal = sc.terminals().get(0);
	   System.out.println(terminal.isCardPresent());	
	   while(terminal.isCardPresent() != true) {
	   
	   }

        return "Registro Creado"; 
    }    
    

    @PostMapping(value = "afiliateUser")  
    public String afiliar(@RequestParam String cui) throws ParseException, IOException {
		return "true";


    }    
    

	private static   void getDPI(com.ingsoft.allpay.methods.SCardConexion sc) throws CardException, DPIConnectException, DPIException, IOException {
		  System.out.println("Leyendo esta maravlla");
		  CardUtils cardUtils; 
		   long startTime = System.currentTimeMillis();
		  System.out.println(CardUtils.checkATR(sc.connect(0, "*").getBytes()));
		   SmartCardDPIReader smartDPI = new SmartCardDPIReader(sc.terminals().get(0));
	       DatosdpiTO dpi;
	       

	  	dpi = smartDPI.readAllData();
	  	smartDPI.readFingerPrintsEnrolled();
	  	System.out.println(dpi.getApellido1());
	  	System.out.println(dpi.getCui());
	  	System.out.println(dpi.getEstadoCivil());
	  	System.out.println(dpi.getFingerPrints().get(0).toString());
	  	ByteArrayToImage(dpi.getFoto());
	  	
		 

		}


		private static String byteToHex(byte[] data) {
			StringBuilder localStringBuilder = new StringBuilder();
			for (int i = 0; i < data.length; i++) {
				String str;
				if ((str = Integer.toHexString(data[i] & 0xFF).toUpperCase()).length() == 1) {
					localStringBuilder.append(0);
				}
				localStringBuilder.append(str).append(" ");
			}
			return localStringBuilder.substring(0, localStringBuilder.length() - 1);
		}

		public static String ByteArrayToImage(byte[] data) throws IOException {
			ByteArrayInputStream bis = new ByteArrayInputStream(data);
			BufferedImage bImage2 = ImageIO.read(bis);
			ImageIO.write(bImage2, "jpg", new File("output.jpg"));
			System.out.println("image created");
			return "image created";
		}
    
}
