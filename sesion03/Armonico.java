package org.pc.sesion03;
import java.util.Scanner;
public class Armonico {
	public static void main(String[] args) {
		int numero;
		double armonico=0;

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("numero armonico");
			numero = teclado.nextInt();
		} while (numero <1);
		
		for(int i= 1; i <= numero; i++){
		armonico = armonico+	1/(double)i;
			
		}
		System.out.println("el valor del numero armonico es " + armonico);
	}


}
