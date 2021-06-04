package model.exceptions;

public class InvalidVehicle extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public InvalidVehicle(String msg) {
		super(msg);
	}
}
