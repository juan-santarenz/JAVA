package ejercicios;

import java.util.Scanner; //necesario para ingresar datos por teclado

public class EnterosMenores {
	public static void main (String[] args) {
		Scanner datos = new Scanner(System.in);
		System.out.print("Ingrese un un numero entero: ");
		int num = datos.nextInt();
		
		System.out.println("El numero ingresado es: "+num);
		
		while(num>0) {
			num--;
			System.out.println("Numeros menores: "+num);
		}
		
		datos.close();
	}
}
