package model.entities;

import java.awt.Color;

public abstract class Vehicle {
	
	private Color color;
	private String model;
	private Double valuePerDay;
	
	public Vehicle(Color color, String model, Double valuePerDay) {
		this.color = color;
		this.model = model;
		this.valuePerDay = valuePerDay;
	}
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Double getValuePerDay() {
		return valuePerDay;
	}
	public void setValuePerDay(Double valuePerDay) {
		this.valuePerDay = valuePerDay;
	}
}
