package model.service;

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
		
	}
}
