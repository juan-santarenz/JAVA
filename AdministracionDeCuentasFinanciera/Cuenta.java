package cuentasFinanciera;

public abstract class Cuenta {
	private double saldo;
	private Cliente cliente;
	
	public Cuenta(int saldo, Cliente cliente) {
		super();
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public abstract void depositar(double deposito) throws OperacionNoValidaException;
	public abstract void extraccion(double extraccion) throws OperacionNoValidaException;
}
