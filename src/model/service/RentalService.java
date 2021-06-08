package model.service;

import model.entities.CarRental;
import model.entities.MotorcycleRental;

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
	
	public Double calcValueRent(CarRental cr) {
		Long t1 = cr.getStart().getTime();
		Long t2 = cr.getFinish().getTime();
		Double time = 0.0;
		if (t1 > t2) {
			time = (double)(t1 - t2) / 1000 / 60 / 60;
		} else {
			time = (double)(t2 - t1) / 1000 / 60 / 60;
		}
		Double basicPayment = 0.0;
		if (time <= 12) {
			basicPayment = getValuePerHour() * Math.floor(time);
		} else {
			basicPayment = getValuePerDay() * Math.floor(time / 24);
		}
		
		return basicPayment + ps.interest(basicPayment);
	}
	
	public Double calcValueRent(MotorcycleRental mr) {
		Long t1 = mr.getStart().getTime();
		Long t2 = mr.getFinish().getTime();
		Double time = 0.0;
		if (t1 > t2) {
			time = (double)(t1 - t2) / 1000 / 60 / 60;
		} else {
			time = (double)(t2 - t1) / 1000 / 60 / 60;
		}
		Double basicPayment = 0.0;
		if (time <= 12) {
			basicPayment = valuePerHour * Math.floor(time);
		} else {
			basicPayment = valuePerDay * Math.floor(time / 24);
		}
		
		return (basicPayment * 0.01 + ps.interest(basicPayment + ps.tax(basicPayment))) + basicPayment;
	}
}
