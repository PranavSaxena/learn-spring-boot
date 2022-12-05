package com.udemy.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//courses

//course details: id,name, author

@RestController
public class CurrencyConfigurationController {

	@Autowired				// to get instance of configuration class in controller to return to mapping
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveAll(){
		return configuration;
	}
	
}
