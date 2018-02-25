package intecap;

import java.util.Scanner;

public class Solucion10 {

	public static void main(String[] args) {
		int numUno;
		int numDos;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese numero 1");
		numUno = entrada.nextInt();
		
		System.out.println("Ingrese numero 2");
		numDos=entrada.nextInt();
		
		if(numUno>numDos) {
			System.out.println("El mayor es " + numUno);
			System.out.println("El menor es " + numDos);
			
		}else {
			System.out.println("El mayor es " + numDos);
			System.out.println("El menor es " + numUno);
			
		}

	}

}
