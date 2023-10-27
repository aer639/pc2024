package sesion02;
import java.util.Scanner;
public class DiaSemana {
	
	public static void main(String[] args) {
		int m = 2;
			int d = 10;
			int y = 2002;
			int y0 = y - (14 - m) / 12;
			int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
			int m0 = m + 12 * ((14 - m) / 12) - 2;
			int d0 = (d + x + (31 * m0) / 12) % 7;
			
			switch (d0) {
			case 0 :
				System.out.println("domingo");
				break;	
			case 1 :
				System.out.println("lunes");
			break;
			case 2:
				System.out.println("martes");
				break;
			case 3 :
				System.out.println("miercoles");
				break;
			case 4 :
				System.out.println("jueves");
				break;
			case 5 :
				System.out.println("viernes");
				break;
			case 6 :
				System.out.println("sabado");
				break;
			default:
		
				break;
			}
		}


}
