package intecap;

import java.util.Scanner;

public class Solucion13 {

	public static void main(String[] args) {

		int numero = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero");

		numero = entrada.nextInt();

		if (numero % 7 == 0) {
			System.out.println("El numero " + numero + " es multiplo de 7");

		} else {
			System.out.println("El numero " + numero + " no es multiplo de 7");
		}

	}

}
