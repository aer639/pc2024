package org.pc.sesion03;

import java.util.Scanner;

public class BucleCentinela {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		int n, contPos, contNeg, cont, sumPos, sumNeg;
		double media;

		System.out.println("Introduce valores enteros, el programa termina si la entrada es 0");
		n = entrada.nextInt();
		contPos = 0;
		contNeg = 0;
		sumPos = 0;
		sumNeg = 0;
		while (n != 0) {
			if (n > 0) {
				contPos++;
				sumPos = sumPos + n;
			}
			else {
				contNeg++;
				sumNeg = sumNeg + n;
			}
			n = entrada.nextInt();
		}

		cont = contPos + contNeg;
		if (cont == 0)
			System.out.println("No hay números");
		else {
			media = (double)(sumPos +sumNeg) / cont;
			System.out.println("El número de positivos es "+contPos);
			System.out.println("El número de negativos es "+contNeg);
			System.out.println("El número total de valores leídos es "+cont);
			System.out.println("La suma de positivos es "+sumPos);
			System.out.println("La suma de negativos es "+sumNeg);
			System.out.println("La media de los valores es "+media);
		}
	}

}
