package ciclos;

import java.util.Scanner;

public class Solution15 {

	public static void main(String[] args) {

		int numeroUno = 0;
		int numeroDos = 1;
		int acumulador;
		int hastaDonde;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		hastaDonde = entrada.nextInt();

		System.out.println(numeroUno);
		System.out.println(numeroDos);
		// System.out.println(numeroDos);

		for (int i = 0; i <= hastaDonde; i++) {

			acumulador = numeroUno;
			numeroUno = numeroDos;
			numeroDos = acumulador + numeroUno;

			if(numeroDos<=hastaDonde) {
				System.out.println(numeroDos);
			}
			/*
			if (numeroDos > hastaDonde) {

				System.out.println(" ");

			} else {
				

			}*/

			if (numeroDos >= hastaDonde) {

				i = numeroDos;

			}

		}

	}

}
