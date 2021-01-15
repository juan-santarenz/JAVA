package cuentasFinanciera;

public class CuentaConLicencia extends Cuenta  {
	public CuentaConLicencia(int saldo, Cliente cliente) {
		super(saldo, cliente);
	}

	public void depositar(double deposito){
			System.out.println("Depositando...\n");
			setSaldo(getSaldo()+deposito);
	}
	public void extraccion(double extraccion) throws OperacionNoValidaException {
		
		if(getSaldo()-extraccion < -500) {
			throw new OperacionNoValidaException("No puede exeder el descubierto de $-500\n");
		}else {
			System.out.println("Realizando extraccion...\n");
			setSaldo(getSaldo()-extraccion);
		}
	}

	public String toString() {
		return getCliente() + "\n\nSaldo cuenta con licencia: $" + getSaldo();
	}
}
