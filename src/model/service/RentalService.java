package model.service;

public class RentalService {
	
	private Double valuePerDay;
	private Double valuePerMonth;
	
	public RentalService(Double valuePerDay, Double valuePerMonth) {
		this.valuePerDay = valuePerDay;
		this.valuePerMonth = valuePerMonth;
	}
	
	public Double getValuePerDay() {
		return valuePerDay;
	}
	
	public void setValuePerDay(Double valuePerDay) {
		this.valuePerDay = valuePerDay;
	}
	
	public Double getValuePerMonth() {
		return valuePerMonth;
	}
	
	public void setValuePerMonth(Double valuePerMonth) {
		this.valuePerMonth = valuePerMonth;
	}
}
