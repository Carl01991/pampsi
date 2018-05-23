package com.ingsoft.allpay;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.smartcardio.CardException;
import javax.smartcardio.CardTerminal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.sltech.dpi.smartcard.DatosdpiTO;
//import com.sltech.dpi.smartcard.SmartCardDPIReader; 
//import com.sltech.dpi.util.CardUtils;



@SpringBootApplication
public class AllpayApplication {

	@SuppressWarnings("restriction")
	public static void main(String[] args) throws CardException  {
		SpringApplication.run(AllpayApplication.class, args); 
 
		
	}



	
	
	
	
	

	
	
	
}
 

