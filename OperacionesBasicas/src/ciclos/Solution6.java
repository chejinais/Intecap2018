package ciclos;

import javax.swing.JOptionPane;

public class Solution6 {


	public static void main(String[] args) {
		
		
		String texto= JOptionPane.showInputDialog("Ingrese texto");
		
		int longitud=texto.length();
		
		//System.out.println(longitud);
		
		System.out.println("El ultimo caracter es  " + texto.substring(longitud-1,longitud));
		System.out.println("La longitud total del texto es " + longitud);
		
		
		
		
		
		System.out.println("---------------------------------");

		
		for(int i=0;i<longitud;i++) {
			char c=texto.charAt(i);
			System.out.println("Letra " + (i+1) + " es " + c);
			
		}
		

	}

}
