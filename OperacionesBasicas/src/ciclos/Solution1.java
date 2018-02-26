package ciclos;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {

		int numero = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese numero");
		
		numero = entrada.nextInt();
		System.out.println("---");

		

		for (int i = 1; i <= numero; i++) {
			System.out.println(i);

		}

	}

}
