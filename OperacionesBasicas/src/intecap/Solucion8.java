package intecap;

import java.util.Scanner;

public class Solucion8 {

	public static void main(String[] args) {

		int numero = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese un numero");
		numero = entrada.nextInt();

		if (numero > 0) {

			System.out.println("El número " + numero + " es positivo");
		} else if(numero<0){

			System.out.println("El número " + numero + " es negativo");

		}else {
			System.out.println("El número " + numero + " es neutro");
			
		}

	}

}
