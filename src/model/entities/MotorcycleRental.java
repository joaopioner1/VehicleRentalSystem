package model.entities;

import java.util.Date;

public class MotorcycleRental {

	protected Date start;
	protected Date finish;
	
	private Motorcycle moto;

	public MotorcycleRental(Date start, Date finish, Motorcycle moto) {
		this.start = start;
		this.finish = finish;
		this.moto = moto;
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

	public Motorcycle getMoto() {
		return moto;
	}

	public void setMoto(Motorcycle moto) {
		this.moto = moto;
	}
	
	
}
