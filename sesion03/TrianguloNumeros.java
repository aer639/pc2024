package org.pc.sesion03;
import java.util.Scanner;

public class TrianguloNumeros {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n, numero;

		do {
			System.out.println("Introduce un valor no superior a 20");
			n = entrada.nextInt();
		}while (n <= 0 || n > 20);

		numero = n * (n+1) / 2;
		for (int fila=1; fila<=n; fila++) {
			for (int col=1; col<=fila; col++) {
				System.out.print(numero+"\t");
				numero--;
			}
			System.out.println();
		}
	}

}
