package com.ensim.TpSpring5.Meteo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Coordinates {
	public double lat;
	public double lon;
}
