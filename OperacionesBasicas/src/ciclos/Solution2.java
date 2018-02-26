package ciclos;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {

		int numero1 = 0;
		int numero2 = 0;
		int resultado = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese numero 1");
		numero1 = entrada.nextInt();
		System.out.println("Ingrese numero 2");
		numero2 = entrada.nextInt();

		resultado = (numero1 + numero2) / 2;

		System.out.println("El promedio es  " + resultado);

		for (int i = resultado; i >= 1; i--) {
			System.out.println(i);

			System.out.println("");
		}

	}

}
