package com.ingsoft.allpay.services;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class RestCountries {
private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
//	MongoTemplate mongoTemplate;

	ObjectMapper objectMapper = new ObjectMapper();
	String result ;
	public void getCountries() throws Exception {

		HttpResponse<JsonNode> response = Unirest.get("https://restcountries-v1.p.mashape.com/all")
				.header("X-Mashape-Key", "oAIK0NSPBFmshaHAYbAl0x369CYLp1jGqBLjsnAK0WjBpxL5yW")
				.header("Accept", "application/json")
				.asJson();

	

	for(int i=0 ; i < response.getBody().getArray().length();i++){
	

		
		

//		mongoTemplate.save(countries);
	}
	
	logger.info("Se Actualizaron "+response.getBody().getArray().length()+" Paises");
	
	
	


	 }
	 
	
	
	
	
}
