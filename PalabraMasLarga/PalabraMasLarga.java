package ejercicios;

import java.util.Scanner;

public class PalabraMasLarga {
	public static void main(String[] args) {
		String arr[] = new String[3];
		
		Scanner datos = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("Ingrese una palabra: ");
			arr[i]=datos.nextLine();
		}
		System.out.println(arr[0].length());
		System.out.println(arr[1].length());
		System.out.println(arr[2].length());
		
		if(arr[0].length()>arr[1].length() && arr[0].length()>arr[2].length()) {
			System.out.println("La palabra mas larga es: "+arr[0]);
		}else if(arr[1].length()>arr[0].length() && arr[1].length()>arr[2].length()) {
			System.out.println("La palabra mas larga es: "+arr[1]);
		}else {
			System.out.println("La palabra mas larga es: "+arr[2]);
		}
		
		datos.close();
	}
}