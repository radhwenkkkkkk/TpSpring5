package com.ensim.TpSpring5.Meteo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Weather {
	public int id;
	public String main;
	public String description;
	public String icon;
}
