package sesion02;

public class EcuacionRecta {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c = 2;
		int d = 4;
		int v;
		int w;
		double pendiente;
		double n;
		if(a == c && b == d) {System.out.println("son los mismos puntos no se puede calcularla recta");
		
		}
		
		else if  (a == c ){
		w= d-b;
		System.out.println("la ecuacion de la recta que pasa por el punto ("+a +","+ b+")  ("+a +","+ b+")  es  x="  +w  );
		}
		else if  (d == b ){
			v= c-a;
			System.out.println("\"la ecuacion de la recta que pasa por el punto ("+a +","+ b+")  ("+a +","+ b+")  es  y= " +v );
			}
		else if  (d!=b && a!=c){
		
			pendiente = (d-b)/(c-a);
			n= ((c*b)-(a*d))/(c-a);
			if (n==0) {
				System.out.println("la ecuacion de la recta que pasa por el punto ("+a +","+ b+")  ("+a +","+ b+")  es x=" +pendiente );
			}
			else
			System.out.println("la ecuacion de la recta que pasa por el punto ("+a +","+ b+")  ("+a +","+ b+")  es x="   +pendiente + "x" + "+"+ (+n) );
		}
			
		}


}
