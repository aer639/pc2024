package org.pc.sesion03;
import java.util.Scanner;

public class ConjeturaUlam {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;
		do {
			System.out.println("introduce un entero positivo");
			valor = teclado.nextInt();
		} while (valor <= 0);

		while (valor != 1) {
			
		if (valor % 2 == 0) {
			valor = valor / 2;
			System.out.print(valor+ "\t");
		} else {
			valor = valor * 3 + 1;
			System.out.print(valor+ "\t");
		}
	}
}

}
