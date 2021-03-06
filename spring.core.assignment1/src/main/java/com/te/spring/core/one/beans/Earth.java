package com.te.spring.core.one.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Earth {
	private double planetRadius;
	private double waterOnPlanetPercentage;

	@Autowired
	@Qualifier("human")
	private Creature creature;

	

	public Earth(double planetRadius, double waterOnPlanetPercentage, Creature creature) {
		super();
		this.planetRadius = planetRadius;
		this.waterOnPlanetPercentage = waterOnPlanetPercentage;
		this.creature = creature;
	}

	public Earth() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Creature getCreature() {
		return creature;
	}

	public void setCreature(Creature creature) {
		this.creature = creature;
	}

	public double getPlanetRadius() {
		return planetRadius;
	}

	public void setPlanetRadius(double planetRadius) {
		this.planetRadius = planetRadius;
	}

	public double getWaterOnPlanetPercentage() {
		return waterOnPlanetPercentage;
	}

	public void setWaterOnPlanetPercentage(double waterOnPlanetPercentage) {
		this.waterOnPlanetPercentage = waterOnPlanetPercentage;
	}

	@Override
	public String toString() {
		return "Earth [planetRadius=" + planetRadius + ", waterOnPlanetPercentage=" + waterOnPlanetPercentage
				+ ", creature=" + creature + "]";
	}

}
