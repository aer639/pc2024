package org.pc.sesion03;

public class Euclides {
	
	public static void main(String[] args) {
		int dividendo = 500;
		int divisor = 5;
		int cociente;
		int resto;
		double division ;
		
		
		division= dividendo/divisor;
		
		resto = dividendo % divisor;
		
		if(resto==0) {
			System.out.println(+divisor);
		}
		
		
		
		while(resto!=0){
			
			dividendo = divisor;
			divisor= resto;
			division= dividendo/divisor;
			resto = dividendo % divisor;
			
			 if (resto==0) {
				 System.out.println(+divisor);
			 }
		
			
			

			
			
			
		}
		
		
		
		
		
		
		

		

	}

}
