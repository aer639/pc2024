package sesion02;

public class Ecuacion2Grado {
	
	public static void main(String[] args) {
		double solucion;
		
			int a = 0;
			int b = 2;
			int c = 3;
			double discriminante;
			if (a == 0) {
				System.out.println("no es escuacion de segundo grado");
			}

			else {
				discriminante = Math.pow(b, 2) - 4 * a * c;
				if (discriminante < 0) {
					System.out.println("no tiene solucion real");
				} else if (discriminante == 0) {
					System.out.println(-b / (2.0 * a));
				} else {
					solucion = (-b + Math.sqrt(discriminante)) / (2 * a);
					System.out.println(solucion);
					solucion = (-b - Math.sqrt(discriminante)) / (2 * a);
					System.out.println(solucion);

				}
			}

		}

}
