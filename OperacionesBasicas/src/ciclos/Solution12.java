package ciclos;

import java.util.Scanner;

public class Solution12 {

	public static void main(String[] args) {
		double resultado = 0;
		double acumulador = 0;
		int contador = 0;
		int diferente = 0;

		String binario;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese binario");
		binario = entrada.next();

		for (int i = binario.length() - 1; i >= 0; i--) {

			char c = binario.charAt(i);

			if (c != '0' && c != '1') {
				diferente++;
				i=0;

			}

			int numeroDecimal = Integer.parseInt(binario.substring(i, i + 1));

			resultado = numeroDecimal * (Math.pow(2, contador));

			acumulador += resultado;
			contador++;

		}
		if (diferente > 0) {
			System.out.println("Invalido");

		} else {

			System.out.println(acumulador);

		}

	}

}
