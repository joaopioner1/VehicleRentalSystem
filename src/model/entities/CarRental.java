package model.entities;

import java.util.Date;

public class CarRental extends MotorcycleRental {

	private Car car;
	
	public CarRental(Date start, Date finish) {
		super(start, finish);
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	
}
