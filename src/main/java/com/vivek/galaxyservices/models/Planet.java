package com.vivek.galaxyservices.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Planet{
	
	private String planetId;
	private String planetName;
	private int moonCount;  
	
	public Planet() {
		super();
	}
}