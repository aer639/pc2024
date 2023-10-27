package org.pc.sesion01;

public class EnfriamientoViento {
	public static void main(String[] args) {
		double t = 40;
		double v = 30;
		
		double w;
		
		w = 35.74+0.6125*t +(0.4275*t-35.75)*Math.pow(v, 0.16) ;
		
System.out.printf("%15s%4.3f%20s\n","temperatura=",t,"(grados fareheint)");
System.out.printf("%16s%3.1f%20s\n","velocidad=",t,"(grados v/s)");

System.out.printf("%16s%3.1f%20s\n","enfriamiento=",w,"(grados)");

}
}