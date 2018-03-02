package ciclos;

import java.util.Scanner;

public class Solution10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese un texto");

		String texto = entrada.next();
		int longitud=texto.length();
		
		for(int i=longitud;i>=1;i--) {
			if (i % 2 == 0) {
				System.out.println("");

			}
			
			char letra = texto.charAt(i-1);
			System.out.println(i + " " + letra);
			
			
			
			
			
		}
		

		

	}

}
