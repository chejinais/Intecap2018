package intecap;

import java.util.Scanner;

public class Solucion7 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		String numero;
		int espacios;
		
		
		System.out.println("Ingrese un numero");
		numero=entrada.nextLine();
		
		espacios=numero.length();
		
		
		char result = numero.charAt(espacios-1);
		System.out.println(result);
		
	
		
		
		/*
		String s = "Strings are immutable";
	      char result = s.charAt(8);
	      System.out.println(result);*/
		
		

	}

}
