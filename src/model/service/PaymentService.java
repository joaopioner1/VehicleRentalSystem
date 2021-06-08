package model.service;

public interface PaymentService {
	
	default Double interest(Double amount) {
		return amount * 0.01;
	}
	
	Double tax(Double amount);
}
