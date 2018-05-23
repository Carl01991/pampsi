package com.ingsoft.allpay.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.ingsoft.allpay.model.DpiModel;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;


@Service
public class CurrensyService {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());


	public void getCurrency(String amoneda) throws Exception {

		HttpResponse<String> response = Unirest.get("https://currency-exchange.p.mashape.com/exchange?from=GTQ&q=1.0&to="+amoneda)
				.header("X-Mashape-Key", "3xuQl4VAH5mshoxtLJQxMJnS9NHhp1EbO62jsntuX2kto0x6zg")
				.header("Accept", "text/plain")
				.asString();

	
logger.info(response.getBody());
	


	}
	
	
	DpiModel saveUSer(@Param("dpi") DpiModel dpi) {
		return null;
	} 
	
	
}
