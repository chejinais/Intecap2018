package ciclos;

import java.util.Scanner;

public class Solution11 {

	public static void main(String[] args) {

		int numero = 0;
		int cociente = 0;
		int residuo = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese numero ");
		String binario = "";
		String binarioAcumulado = "";
		numero = entrada.nextInt();

		int contador = 0;
		
		if(numero==0) {
			System.out.println("0");
			
		}else {

		for (int i = numero; i >= 1; i--) {

			cociente = numero / 2;
			residuo = numero % 2;

			if (residuo == 1) {
				binario = "1";

			} else if (residuo != 1) {
				binario = "0";

			}

			binarioAcumulado = binario + binarioAcumulado;

			// Esta es la parte que detiene el ciclo

			if (numero == 1) {
				i = 1;

			}
			numero = cociente;

		}
		
		System.out.println(binarioAcumulado);
		}

		//String invertida = "";

		// esta es la parte que invierte el string

		/*for (int x = binarioAcumulado.length() - 1; x >= 0; x--) {
			invertida = invertida + binarioAcumulado.charAt(x);
		}*/

		//System.out.println(invertida);

	}

}
