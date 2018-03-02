package ciclos;

import java.util.Arrays;
import java.util.Scanner;

public class Solution14 {
	public static void main(String[] args) {
		
		int numero=0;
		int total=0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		numero=entrada.nextInt();
		int [] arregloEnteros=new int [numero];
		
		for(int i=1;i<(numero/2)+1;i++) {
			
			if(numero%i==0) {
				
				arregloEnteros[i]=i;
				
				
				
			}
			
		}
		
		for(int j=0;j<arregloEnteros.length;j++) {
			
			total+=arregloEnteros[j];
			
		}
		
		if(numero==total) {
		System.out.println("La sumatoria de sus divisores es " + total+ " es perfecto");
		
		
		}else {
			System.out.println("La sumatoria de sus divisores es " + total + " no es perfecto");
		}
		
	}

}
