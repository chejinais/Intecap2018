package intecap;

import java.util.Scanner;

public class Solucion5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		double baseTriangulo = 0;
		double alturaTriangulo=0;
		double resultado=0;
		
		System.out.println("Ingrese base del triangulo");
		baseTriangulo=entrada.nextDouble();
		
		System.out.println("Ingrese altura del triangulo");
		alturaTriangulo=entrada.nextDouble();
		
		resultado=(baseTriangulo*alturaTriangulo)/2;
		
		System.out.println("El area del triangulo es " + resultado );
		
		
		

	}

}
