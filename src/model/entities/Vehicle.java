package model.entities;

import model.Enum.ColorEnum;
import model.exceptions.InvalidVehicle;

public class Vehicle {
	
	private ColorEnum color;
	private String model;
	
	public Vehicle() {
	}
	
	public Vehicle(ColorEnum color, String model) {
		this.color = color;
		this.model = model;
	}
	
	public ColorEnum getColor() {
		return color;
	}
	public void setColor(ColorEnum color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public boolean checkType(Character character) {
		if (character == 'M') {
			return true;
		} else if (character == 'C') {
			return false;
		} else {
			throw new InvalidVehicle("Enter M or C! Wrong data entered.");
		}
	}
}
