package com.vivek.galaxyservices.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.vivek.galaxyservices.models.Planet;
import com.vivek.galaxyservices.repositories.PlanetJdbcRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PlanetController {
	
	@Autowired
	PlanetJdbcRepository repository;

	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
	
	@RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }
	
	@RequestMapping("/planets")
    public Planet fetchPlanetsFromH2() {
        return repository.findById("SP3");
    }

}