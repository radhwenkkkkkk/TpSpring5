package com.ensim.TpSpring5.Adresse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class Feature {
	public String type;
	public Geometry geometry;
	public Properties properties;
}