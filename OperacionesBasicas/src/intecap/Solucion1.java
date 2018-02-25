package intecap;

import javax.swing.JOptionPane;

public class Solucion1 {

	public static void main(String[] args) {
		int numeroUno;
		int numeroDos;
		int numeroTres;
		int numeroCuatro;
		int numeroCinco;
		double  suma;
		double promedio;
		
		numeroUno=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
		numeroDos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
		numeroTres=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 3"));
		numeroCuatro=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 4"));
		numeroCinco=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 5"));
		
		suma= numeroUno+numeroDos+numeroTres+numeroCuatro+numeroCinco;
		promedio=(double)(suma/5);
		
		
		JOptionPane.showMessageDialog(null,String.format("La suma es " + suma + " y el promedio " + "%.2f",promedio));
		
		

	}

}
