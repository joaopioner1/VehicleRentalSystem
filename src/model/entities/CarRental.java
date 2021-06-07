package model.entities;

import java.util.Date;

public class CarRental {

	private MotorcycleRental m;
	private Car car;
	private Date start;
	private Date finish;
	
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

	public MotorcycleRental getM() {
		return m;
	}

	public void setM(MotorcycleRental m) {
		this.m = m;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFinish() {
		return finish;
	}

	public void setFinish(Date finish) {
		this.finish = finish;
	}

}
