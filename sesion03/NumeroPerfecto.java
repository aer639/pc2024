package org.pc.sesion03;
import java.util.Scanner;

public class NumeroPerfecto {
	
public static void main(String[] args) {
		
		int numero;
		
		int sumaDivisores = 1;
		Scanner teclado = new Scanner (System.in);

		do {
			System.out.println("numero elejido");
			numero = teclado.nextInt();
		} while (numero <= 1);
		
		for (int divisor = 2;divisor <= numero / 2;divisor++) {
			
			if(numero%divisor == 0) {
				
				sumaDivisores= sumaDivisores + divisor;
				
				
				
			}
			
			if (numero== sumaDivisores) {
				
				System.out.println("el numero es perfecto");
				
				
			}else {
				System.out.println("no es perfecto");
			}

	}

}

}
