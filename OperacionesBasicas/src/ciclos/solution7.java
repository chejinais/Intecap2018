package ciclos;

import javax.swing.JOptionPane;

public class solution7 {
	//Solicitar un texto e indicar si el primer y último carácter son iguales.
	

	public static void main(String[] args) {
		
		String texto;
		texto=JOptionPane.showInputDialog("Ingrese un texto");
		int longitud=texto.length();
		
		char char1=texto.charAt(0);
		char char2=texto.charAt(longitud-1);
		
		System.out.println("El primer caracter es " + char1);
		System.out.println("El segundo caracter es " + char2);
		
		
		for(int i=0;i<texto.length();i++) {
			
			char letra =texto.charAt(i);
			System.out.println(letra);
			
			
			
		}
		
		if(texto.charAt(0)==texto.charAt(longitud-1)) {
			System.out.println("El primer y ultimo caracter son iguales");
			
		}else {
			System.out.println("El primer y ultimo caracter son diferentes");
			
		}
		
		

	}

}
