package intecap;

import java.util.Scanner;

public class Solucion14 {

	public static void main(String[] args) {

		int numero = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero");

		numero = entrada.nextInt();

		int digitoFinal = 0;

		digitoFinal = numero % 10;

		if (digitoFinal != 0) {

			if (digitoFinal % 2 == 0) {

				System.out.println("El digito final es par");

			} else {

				System.out.println("El digito final es impar");
			}

		} else {
			System.out.println("El numero es neutro");
		}

	}

}
