package model.service;

public class RentalService {
	
	private Double valuePerDay;
	private Double valuePerHour;
	
	
	public RentalService(Double valuePerDay, Double valuePerHour) {
		this.valuePerDay = valuePerDay;
		this.valuePerHour = valuePerHour;
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
}
