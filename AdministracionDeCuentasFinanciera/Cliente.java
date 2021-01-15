package cuentasFinanciera;

public class Cliente {
	
	private String nombreApellido;
	int dni, edad, a�oNac;
	
	public Cliente(String nombreApellido, int dni, int edad, int a�oNac) throws EdadNoValidaException {
		super();
		this.nombreApellido = nombreApellido;
		this.dni = dni;
		if(edad < 18) {
			throw new EdadNoValidaException("\nNo se pueden registrar clientes menores de edad\n");
		}else {
			this.edad = edad;
		}
		this.a�oNac = a�oNac;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getA�oNac() {
		return a�oNac;
	}

	public void setA�oNac(int a�oNac) {
		this.a�oNac = a�oNac;
	}

	public String toString() {
		return "Cliente:\n" + "Nombre y Apellido: "+nombreApellido + "\nDNI N�: " + dni + "\nEdad: " + edad + "\nA�o de Nacimiento: " + a�oNac;
	}
}
