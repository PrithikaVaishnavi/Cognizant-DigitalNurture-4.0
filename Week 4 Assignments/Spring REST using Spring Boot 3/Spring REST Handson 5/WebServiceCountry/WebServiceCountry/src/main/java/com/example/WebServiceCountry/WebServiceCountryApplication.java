package com.example.WebServiceCountry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:country.xml")
@SpringBootApplication
public class WebServiceCountryApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(WebServiceCountryApplication.class, args);
	}

}
