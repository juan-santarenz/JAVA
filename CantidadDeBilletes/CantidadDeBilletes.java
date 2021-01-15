package ejercicios;

import java.util.Scanner;

public class CantidadDeBilletes {
	public static void main(String[] args) {
		int dinero,b100,b50,b20,b10,b2,b1;
		
		Scanner datos = new Scanner(System.in);
		
		System.out.print("Ingrese un monto de dinero: ");
		dinero = datos.nextInt();
		
		System.out.println("Usted ingreso: $"+dinero);
		
		b100=dinero/100;
		b50=(dinero-100*b100)/50;
		b20=((dinero-100*b100) - (50*b50))/20;
		b10=((dinero-100*b100) - (50*b50) - (20*b20))/10;
		b2=((dinero-100*b100) - (50*b50) - (20*b20) - (10*b10))/2;
		b1=((dinero-100*b100) - (50*b50) - (20*b20) - (10*b10) - (2*b2))/1;
		
		System.out.println("Billetes de $100: " + b100);
		System.out.println("Billetes de $50: " + b50);
		System.out.println("Billetes de $20: " + b20);
		System.out.println("Billetes de $10: " + b10);
		System.out.println("Monedas de $2: " + b2);
		System.out.println("Monedas de $1: " + b1);
		
		
		datos.close();
	}
}
