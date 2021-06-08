package model.service;

public class MotoService implements PaymentService {
	
	@Override
	public Double tax(Double amount) {
		return amount * 0.03;
	}
}
