package model.service;

public class CarService implements PaymentService {
	
	@Override
	public Double tax(Double amount) {
		return amount * 0.02;
	}
	
}
