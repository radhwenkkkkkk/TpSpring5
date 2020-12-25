package com.ensim.TpSpring5.Adresse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Geometry {
	public String type;
	public double coordinates[];
}