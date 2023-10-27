package sesion02;

import java.util.Scanner;

public class OperacionAritmetica {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int x, y;
		double resultado;
		String operacion;

		System.out.println("Introduzca valores: ");
		x = entrada.nextInt();
		y = entrada.nextInt();
		System.out.println("Introduzca operación (+, -, *, /): ");
		operacion = entrada.next();

		System.out.println();
		System.out.println("Los datos son: ");
		System.out.println("x = "+x+", y = "+y);
		System.out.println("La operación elegida es: "+operacion);
		System.out.println();
		switch (operacion) {
		case "+":
			resultado = x + y;
			System.out.println("El resultado de la operación es: "+x+" "+operacion+" "+y+" = "+resultado);
			break;
		case "-":
			resultado = x - y;
			System.out.println("El resultado de la operación es: "+x+" "+operacion+" "+y+" = "+resultado);
			break;
		case "*":
			resultado = x * y;
			System.out.println("El resultado de la operación es: "+x+" "+operacion+" "+y+" = "+resultado);
			break;
		case "/":
			resultado = (double) x / y;
			System.out.println("El resultado de la operación es: "+x+" "+operacion+" "+y+" = "+resultado);
			break;
		default:
			System.out.println("Operación no válida");
		}
	}

}
