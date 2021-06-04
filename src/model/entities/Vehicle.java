package model.entities;

import java.awt.Color;

import model.exceptions.InvalidVehicle;

public class Vehicle {
	
	private Color color;
	private String model;
	
	public Vehicle() {
	}
	
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
	
	public boolean processInfo(Character character) {
		if (character == 'M') {
			return true;
		} else if (character == 'C') {
			return false;
		} else {
			throw new InvalidVehicle("Enter M or C! Wrong data entered.");
		}
	}
}
