package ciclos;

import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		//Mostrar el resultado de la operación:
		//1/n + 2/n + 3/n +..+ n/n
		
		double acumulado=0;
		double numero = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese numero");
		numero=entrada.nextInt();
		
		for(int i=1;i<=numero;i++) {
			double resultado=0;
			
			
			resultado=i/numero;
			acumulado=  acumulado+resultado;
			
			
		}
		
		System.out.println(acumulado);
		
		
		

	}

}
