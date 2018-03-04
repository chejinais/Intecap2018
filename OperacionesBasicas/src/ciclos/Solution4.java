package ciclos;

import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {

		int promedio = 0;
		int resultado = 0;
		int numero = 0;
		Scanner entrada = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println("Ingrese numero " + i);
			numero = entrada.nextInt();
			resultado += numero;

		}
		promedio = resultado / 5;
		System.out.println("El resultado es " + resultado);
		System.out.println("El promedio es " + promedio);

		for (int i = 2; i <= promedio; i += 2) {

			System.out.println(i);

		}

	}

}
