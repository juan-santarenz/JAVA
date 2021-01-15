package cuentasFinanciera;

public class OperacionNoValidaException extends Exception {
	private static final long serialVersionUID = 1L;

	public OperacionNoValidaException(String mensaje) {
		super(mensaje);
	}
	
	public OperacionNoValidaException() {
		this(null);
	}
}
