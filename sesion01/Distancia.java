package org.pc.sesion01;

public class Distancia {
	
	public static void main(String[] args) {
		double distancia;
		double x,y,c,d;
		x=2.0;
		y=1.0;
		c=0.0;
		d=0.0;
		
		
		distancia=Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)));
		System.out.printf("la distancia del punto ("+x +","+  y+") al punto(0,0) es de "+(distancia));
		

}
}