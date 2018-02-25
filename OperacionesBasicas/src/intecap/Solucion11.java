package intecap;

import java.util.Scanner;

public class Solucion11 {

	public static void main(String[] args) {

		int[] mi_arreglo = new int[5];
		int positivo = 0;
		int negativo = 0;
		int neutro = 0;

		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Ingrese numero " + (i + 1));
			mi_arreglo[i] = entrada.nextInt();

			if (mi_arreglo[i] < 0) {
				positivo++;

			} else if (mi_arreglo[i] > 0) {
				negativo++;

			} else {
				neutro++;
			}

		}
		System.out.println("La cantidad de positivos es " + positivo);
		System.out.println("La cantidad de negativos es " + negativo);
		System.out.println("La cantidad de neutros es " + neutro);

	}

}
