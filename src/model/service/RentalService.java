package model.service;

import model.entities.CarRental;

public class RentalService {
	
	private Double valuePerDay;
	private Double valuePerHour;
	
	private PaymentService ps;
	
	public RentalService() {
	}
	
	public RentalService(Double valuePerDay, Double valuePerHour, PaymentService ps) {
		this.valuePerDay = valuePerDay;
		this.valuePerHour = valuePerHour;
		this.ps = ps;
	}

	public Double getValuePerDay() {
		return valuePerDay;
	}
	
	public void setValuePerDay(Double valuePerDay) {
		this.valuePerDay = valuePerDay;
	}
	
	public Double getValuePerHour() {
		return valuePerHour;
	}
	
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public void calcValueCarRent(CarRental cr) {
		Long t1 = cr.getStart().getTime();
		Long t2 = cr.getFinish().getTime();
		Double time = (double)(t1 - t2) / 1000 / 60 / 60;
		
		if () {
			
		}
	}
}
