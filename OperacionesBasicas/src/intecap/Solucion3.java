package intecap;

import javax.swing.JOptionPane;

public class Solucion3 {

	public static void main(String[] args) {
		
		int numero;
		
		numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		
		operacion(numero);
		
		
		

	}
	
	public static void operacion(int numero) {
		
		int num;
		
		num=numero;
		
		System.out.println("1 x " + num + " = " + (num * 1));
		System.out.println("2 x " + num + " = " + (num * 2));
		System.out.println("3 x " + num + " = " + (num * 3));
		System.out.println("4 x " + num + " = " + (num * 4));
		System.out.println("5 x " + num + " = " + (num * 5));
		System.out.println("6 x " + num + " = " + (num * 6));
		System.out.println("7 x " + num + " = " + (num * 7));
		System.out.println("8 x " + num + " = " + (num * 8));
		System.out.println("9 x " + num + " = " + (num * 9));
		System.out.println("10 x " + num + " = " + (num * 10));
		
		
		
		
		
		
	}

}
