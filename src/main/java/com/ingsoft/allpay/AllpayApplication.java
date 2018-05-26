package com.ingsoft.allpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;






@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class AllpayApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AllpayApplication.class);
    }

	public static void main(String[] args)   {
		SpringApplication.run(AllpayApplication.class, args); 
 
		
	}



	
	
	
	
	

	
	
	
}
 

