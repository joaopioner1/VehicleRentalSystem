package model.exceptions;

public class NoValidDate extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public NoValidDate(String message) {
		super(message);
	}
}
