package cuentasFinanciera;

public class EdadNoValidaException extends Exception {

	private static final long serialVersionUID = 1L;

	public EdadNoValidaException(String mensaje) {
		super(mensaje);
	}
	
	public EdadNoValidaException() {
		this(null);
	}
}
