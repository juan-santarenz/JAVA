package cuentasFinanciera;

public class CuentaStandar extends Cuenta {

	public CuentaStandar(int saldo, Cliente cliente) {
		super(saldo, cliente);
	}

	public void depositar(double deposito) throws OperacionNoValidaException {
		if(getSaldo()+deposito > 100000) {
			throw new OperacionNoValidaException("Supera el monto maximo de deposito\n");
		}else {
			System.out.println("Depositando...\n");
			setSaldo(getSaldo()+deposito);
		}
	}
	public void extraccion(double extraccion) throws OperacionNoValidaException {
		
		if(getSaldo()-extraccion < 0) {
			throw new OperacionNoValidaException("No puede quedar un saldo negativo\n");
		}else {
			System.out.println("Realizando extraccion...\n");
			setSaldo(getSaldo()-extraccion);
		}
	}

	public String toString() {
		return getCliente() + "\n\nSaldo cuenta standar: $" + getSaldo();
	}
}