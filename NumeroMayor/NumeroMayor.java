package ejercicios;

public class NumeroMayor {
	public static void main(String[] args) {
		int n1 = 240;
		int n2 = 40;
		int n3 = 20;
		
		if(n1>n2 && n1>n3) {
			System.out.println("El numero mayor es: "+n1);
		}else if(n2>n1 && n2>n3) {
			System.out.println("El numero mayor es: "+n2);
		}else {
			System.out.println("El numero mayor es: "+n3);
		}
	}
}
