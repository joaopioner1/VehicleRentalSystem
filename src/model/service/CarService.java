package model.service;

import model.exceptions.NoValidDate;

public class CarService implements PaymentService {

	@Override
	public Double payment(Double amount, Double hours) {
		if (hours <= 0 ) {
			throw new NoValidDate("You must stay with the vehicle for at least 1 hour");
		} else {
			return amount * hours + interest(amount); 
		}
	}
}
