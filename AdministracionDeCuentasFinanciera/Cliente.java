package cuentasFinanciera;

public class Cliente {
	
	private String nombreApellido;
	int dni, edad, añoNac;
	
	public Cliente(String nombreApellido, int dni, int edad, int añoNac) throws EdadNoValidaException {
		super();
		this.nombreApellido = nombreApellido;
		this.dni = dni;
		if(edad < 18) {
			throw new EdadNoValidaException("\nNo se pueden registrar clientes menores de edad\n");
		}else {
			this.edad = edad;
		}
		this.añoNac = añoNac;
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

	public int getAñoNac() {
		return añoNac;
	}

	public void setAñoNac(int añoNac) {
		this.añoNac = añoNac;
	}

	public String toString() {
		return "Cliente:\n" + "Nombre y Apellido: "+nombreApellido + "\nDNI N°: " + dni + "\nEdad: " + edad + "\nAño de Nacimiento: " + añoNac;
	}
}
