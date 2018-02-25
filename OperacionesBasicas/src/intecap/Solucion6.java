package intecap;

import java.util.Scanner;

public class Solucion6 {

	public static void main(String[] args) {
		
		double catetoVertical=0;
		double catetoHorizontal=0;
		double hipotenusa=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese cateto vertical");
		catetoVertical=entrada.nextDouble();
		
		System.out.println("Ingrese cateto horizontal");
		catetoHorizontal=entrada.nextDouble();

		
		hipotenusa= Math.sqrt((Math.pow(catetoVertical, 2)+(Math.pow(catetoHorizontal, 2))));
		
		System.out.println("La hipotenusa del triangulo rectangulo es " + hipotenusa);
	}

}
