package sesion02;

import java.util.Scanner;

public class DiaJuliano {
	public static void main(String[] args) {
		int dia;
		int  mes;
		int diajuliano;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce valor del dia");

		dia = teclado.nextInt();

		System.out.println("introduce valor del mes del 1 al 12 por orden");

		mes = teclado.nextInt();

		switch (mes) {
		case 1:
			diajuliano = dia;
			System.out.println(diajuliano);

			break;

		case 2:
			diajuliano = 31 + dia;
			System.out.println(diajuliano);

			break;
		case 3:
			diajuliano = 59 + dia;
			System.out.println(diajuliano);
			break;

		case 4:
			diajuliano = 90 + dia;
			System.out.println(diajuliano);
			break;

		case 5:
			diajuliano = 120 + dia;
			System.out.println(diajuliano);
			break;

		case 6:
			diajuliano = 151 + dia;
			System.out.println(diajuliano);
			break;

		case 7:
			diajuliano = 181 + dia;
			System.out.println(diajuliano);
			break;

		case 8:
			diajuliano = 212 + dia;
			System.out.println(diajuliano);
			break;

		case 9:
			diajuliano = 243 + dia;
			System.out.println(diajuliano);
			break;

		case 10:
			diajuliano = 273 + dia;
			System.out.println(diajuliano);
			break;

		case 11:
			diajuliano = 304 + dia;
			System.out.println(diajuliano);
			break;

		case 12:
			diajuliano = 334 + dia;
			System.out.println("El día juliano correspondiente al día "+dia+" del mes "+mes+" es "+diajuliano);
			break;

		default:
			
			System.out.println("no se corresponde a ningun mes ");
			

			break;

		

	}

}

}
