/*
 * @author Juan Ignacio Santarenz Pessano
 * 
 */


package classComplejo;

import java.util.Arrays;

public class Complejo implements Comparable<Complejo>{
	private double img, real;
	
	
	public Complejo() { //CONSTRUCTOR POR DEFECTO
		this(0,0);
	}
	
	public Complejo(double real,double img) { //CONSTRUCTOR CON DOS PARAMETROS
		this.real= real;
		this.img= img;
	}
	
	// GET AND SET
	public double getImg() {
		return img; 
	}
	public void setImg(double img) {
		this.img = img;
	}
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	
	//METODO PARA LA SUMA
	public Complejo sumar(Complejo sumaComplejo) {
		
		Complejo suma = new Complejo();
		
		suma.real= this.getReal() + sumaComplejo.real;
		suma.img= this.getImg() + sumaComplejo.img ;
		
		return suma;
	}
	//METODO PARA LA MULTIPLICACION
	public Complejo multiplicacion(Complejo multipliComplejo) {
		
		Complejo multipli = new Complejo();
		
		multipli.real= (this.getReal() * multipliComplejo.real) - (this.getImg() * multipliComplejo.img) ;
		multipli.img= (this.getReal() * multipliComplejo.img) + (this.getImg() * multipliComplejo.real);
		
		return multipli;
	}
	
	//EQUALS
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		if (Double.doubleToLongBits(img) != Double.doubleToLongBits(other.img))
			return false;
		if (Double.doubleToLongBits(real) != Double.doubleToLongBits(other.real))
			return false;
		return true;
	}

	public double modulo () {
		return Math.sqrt(this.getReal()*this.getReal()+this.getImg()*this.getImg());
	}
	
	public int compareTo(Complejo x){
		if(this.modulo()<x.modulo())
			return -1;
		if(this.modulo()>x.modulo())
			return 1;
		else return 0;
	}
	
	public String toString() {
		return "(" + real + ", " + img + "i)";
	}

	public static void main(String[] args) {
		Complejo n1 = new Complejo(5.1,2.1);
		Complejo n2 = new Complejo(6,2);
		Complejo n3 = new Complejo();
		
		n3 = n1.sumar(n2);
		System.out.println(n1+" + "+n2+" = "+n3);
		
		n3=n1.multiplicacion(n2);
		System.out.println("\n"+n1+" * "+n2+" = "+n3);
		
		System.out.println("\n"+n1.equals(n2)+"\n");
		
		System.out.println(n1==n2);
		
		
		
		/*En Java, el operador == compara los dos objetos para ver si apuntan a
		 *la misma ubicaci�n de memoria; mientras que el m�todo . 
		 *equals() en realidad compara los dos objetos para ver si tienen 
		 *el mismo valor de objeto. 
		 */
		

		Complejo[] vector = new Complejo[10];
		
		System.out.println("\nvector desordenado:\n");
		for (int i=0; i<10;i++) {
			vector[i]= new Complejo(Math.random()*15,Math.random()*15);
			System.out.println((double)Math.round(vector[i].modulo()*100d)/100);
		}
		
		
		Arrays.sort(vector);
		
		System.out.println("\nVector ordenado\n");
		for(int i=0; i<10; i++) {
			System.out.println((double)Math.round(vector[i].modulo()*100d)/100);
		}
	}
}	