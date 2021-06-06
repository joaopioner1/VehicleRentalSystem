package model.service;

public interface PaymentService {
	
	Double payment(Double amount, Double hours);
	
	default Double interest(Double amount) {
		return amount * 0.01;
	}
}
