package model.entities;

import java.awt.Color;

public abstract class Vehicle {
	
	private Color color;
	private String model;
	
	public Vehicle(Color color, String model) {
		this.color = color;
		this.model = model;
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
}
