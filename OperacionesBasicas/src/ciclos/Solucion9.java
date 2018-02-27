package ciclos;

import java.util.Scanner;

public class Solucion9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese un texto");

		String texto = entrada.next();

		for (int i = 1; i <= texto.length(); i++) {

			char letra = texto.charAt(i - 1);
			System.out.println(i + " " + letra);

			if (i % 3 == 0) {
				System.out.println("");

			}

		}

	}

}
