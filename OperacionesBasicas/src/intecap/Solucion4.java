package intecap;

import java.util.Scanner;

public class Solucion4 {

	public static void main(String[] args) {
		
		double numero=0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		numero=entrada.nextDouble();
		
		System.out.print("El numero " + numero + " elevado a la 5ta potencia es ");  
		System.out.printf("%.2f",(Math.pow(numero, 5)));

	}

}
