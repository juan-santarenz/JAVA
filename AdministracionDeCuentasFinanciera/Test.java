/*
 *
 * 
 * 
 * 
 * 
 * 
 * @author Juan Ignacio Santarenz Pessano
 * 
 * 
 * 
 * 
 * 
 */


package cuentasFinanciera;

public class Test {

	public static void main(String[] args) {
	
	// Edad no vlida
	try {
		Cliente cl1 = new Cliente("juan santarenz",38590154,17,1995);		
		System.out.println(cl1);
	}catch(EdadNoValidaException edadNoValida) {
			System.out.println(edadNoValida.getMessage());
		}
	
	// cuenta standar operacion no valida
	try {
		System.out.println("\n-------------------------------------------------------\n");
		Cliente cl2 = new Cliente("carlos sanchez",385,18,2000);
		CuentaStandar c1 = new CuentaStandar(0,cl2);
		
		System.out.println(c1);
		c1.depositar(99998);
		System.out.println(c1);
		c1.depositar(2);
		System.out.println(c1);
		c1.depositar(2);
			
		System.out.println(c1);
		c1.extraccion(100);
				
		System.out.println(c1);
		c1.extraccion(10);
				
		System.out.println(c1);
		
				
		}catch(EdadNoValidaException edadNoValida) {
			System.out.println(edadNoValida.getMessage());
		}
		catch(OperacionNoValidaException operacionNoValida) {
			System.out.println(operacionNoValida.getMessage());
		}
	
	// cuenta especial operacion no valida
	try {
		System.out.println("\n-------------------------------------------------------\n");
		Cliente cl3 = new Cliente("juan perez",90154,25,1995);
		CuentaConLicencia c2 = new CuentaConLicencia(500,cl3);
				
		System.out.println(c2);
				
		c2.extraccion(10000);
		System.out.println(c2);
				
		c2.extraccion(3);
		System.out.println(c2);
				
		c2.extraccion(3);
		System.out.println(c2);
				
		}catch(EdadNoValidaException edadNoValida) {
			System.out.println(edadNoValida.getMessage());
		}catch(OperacionNoValidaException operacionNoValida) {
			System.out.println(operacionNoValida.getMessage());
		}
	}
}