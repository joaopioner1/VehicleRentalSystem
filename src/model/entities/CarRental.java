package model.entities;

import java.util.Date;

public class CarRental {

	private MotorcycleRental m;
	private Car car;
	
	public CarRental(Date start, Date finish, Car car) {
		this.m.start = start;
		this.m.finish = finish;
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	
}
