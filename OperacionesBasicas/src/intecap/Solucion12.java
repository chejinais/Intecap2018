package intecap;

import java.util.Arrays;
import java.util.Scanner;

public class Solucion12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int[] mi_arreglo = new int[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese numero " + (i + 1));
			mi_arreglo[i] = entrada.nextInt();

		}

		Arrays.sort(mi_arreglo);

		System.out.println("El mayor es " + mi_arreglo[2]);
		System.out.println("El menor es " + mi_arreglo[0]);

	}

}
