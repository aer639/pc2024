package org.pc.sesion03;

import java.util.Scanner;

public class Primo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n, i;
		boolean p;

		do {
			System.out.println("Introduce un n�mero (>1) para saber si primo");
			n = entrada.nextInt();
		}
		while (n <= 1);
		
		p = true;
		i = 2;
		while (i<=n/2 && p == true) {
			if (n % i == 0)
				p = false;
			else
				i++;
		}

		if (p == true)
			System.out.println("SI ES PRIMO");
		else
			System.out.println("NO ES PRIMO");
	}

}
