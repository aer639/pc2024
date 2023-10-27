package org.pc.sesion03;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		int k, f1, f2, fi;

		do {
			System.out.println("Indica cuántos términos quieres mostrar de la serie de Fibonacci");
			k = entrada.nextInt();
		}
		while (k <= 0);
		
		if (k == 1)
			System.out.println("0");
		else {
			if (k == 2)
				System.out.println("0 \t 1");
			else {
				System.out.println("0 \t 1 \t");
				f1 = 1;
				f2 = 2;
				fi = f1 + f2;
				for (int i=3; i<=k; i++) {
					fi = f1 + f2;
					System.out.print(fi+"\t");
					f2 = f1;
					f1 = fi;
				}
			}
		}
	}

}
