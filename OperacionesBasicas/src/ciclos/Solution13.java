package ciclos;

import java.util.Scanner;

public class Solution13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		int numero=entrada.nextInt();
		int bandera=0;
		
		for(int i=2;i<=(numero/2);i++) {
			if(numero%i==0) {
				bandera++;
				
				
			}
			
		}
		if(bandera==0) {
			System.out.println("Es primo");
			
		}else {
			System.out.println("No es primo");
		}

	}

}
