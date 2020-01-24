package fr.renault.kata.yatzy.roll;

public class RollException extends RuntimeException {

	private static final long serialVersionUID = 4659387109773065455L;

	public RollException(final String message) {
		super(message);
	}
}
