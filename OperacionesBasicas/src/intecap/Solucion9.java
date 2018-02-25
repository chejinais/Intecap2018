package intecap;

import java.util.Scanner;

public class Solucion9 {

	public static void main(String[] args) {
		int numUno;
		int numDos;
		int resultado;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese numero uno");
		numUno = entrada.nextInt();

		System.out.println("Ingrese numero dos");
		numDos = entrada.nextInt();

		resultado = numUno + numDos;
		System.out.println("La suma de " + numUno + " + " + numDos + " es " + resultado);

		if (resultado % 2 == 0) {
			System.out.println("El resultado es par");

		} else {
			System.out.println("El resultado es impar");

		}

	}

}
