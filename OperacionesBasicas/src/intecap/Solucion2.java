package intecap;

import java.util.Scanner;

public class Solucion2 {

	public static void main(String[] args) {
		
		int numUno;
		int numDos;
		
		System.out.println("Ingrese primer número");
		Scanner entrada= new Scanner (System.in);
		numUno = entrada.nextInt();
		System.out.println("Ingrese segundo número");
		numDos = entrada.nextInt();
		
		System.out.println("El resultado de la suma es " + (numUno+numDos));
		System.out.println("El resultado de la resta es " + (numUno-numDos));
		System.out.println("El resultado de la multiplicación es " + (numUno*numDos));
		System.out.println("El resultado de la división es " + (numUno/numDos));
		
	

	}

}
