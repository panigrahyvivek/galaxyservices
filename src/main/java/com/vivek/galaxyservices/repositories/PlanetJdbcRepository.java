package com.vivek.galaxyservices.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vivek.galaxyservices.models.Planet;

@Repository
public class PlanetJdbcRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Planet findById(String planetId) {
		return jdbcTemplate.queryForObject("select * from SOLAR_PLANETS where planetId=?", new Object[] { planetId },
				new BeanPropertyRowMapper<Planet>(Planet.class)); 
	}
}