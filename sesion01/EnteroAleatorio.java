package org.pc.sesion01;

public class EnteroAleatorio {
	public static void main(String[] args) {
		int min = -15 ;// limite inferior
		int max = 21 ;// limite superior 
		
		double r = Math.random(); // real mayor igual 00 
	
		int enteroGenerado =(int)  (r*(max- min+1 )) +min;
		
		System.out.println("el entero generado es :"+enteroGenerado);

	}

}
