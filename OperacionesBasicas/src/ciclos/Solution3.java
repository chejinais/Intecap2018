package ciclos;

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		
		int numero=0;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingrese número");
		numero=entrada.nextInt();
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(numero +" X "+ i+ " = " + (i*numero));
			
		}
		
		
		

	}

}
