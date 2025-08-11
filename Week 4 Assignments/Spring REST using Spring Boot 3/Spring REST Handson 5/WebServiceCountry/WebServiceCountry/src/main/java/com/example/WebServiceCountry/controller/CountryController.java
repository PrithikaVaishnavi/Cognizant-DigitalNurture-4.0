package com.example.WebServiceCountry.controller;

import com.example.WebServiceCountry.service.CountryService;
import com.example.WebServiceCountry.model.Country;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController 
{
	@Autowired
    private CountryService countryService;

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) 
    {
        return countryService.getCountry(code);
    }
}


