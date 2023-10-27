package sesion02;
import java.util.Scanner;
public class CodigoDefectuoso {
	public static void main(String [] args) {
		Scanner entrada = new Scanner (System.in);
		int codigo;

		System.out.println("Introduzca código a comprobar: ");
		codigo = entrada.nextInt();
		if (codigo >= 14681 && codigo <= 15681)
			System.out.println("El código "+codigo+" corresponde a un artículo DEFECTUOSO");
		else {
			if (codigo >= 70001 && codigo <= 79999)
				System.out.println("El código "+codigo+" corresponde a un artículo DEFECTUOSO");
			else {
				if (codigo >= 99999 && codigo <= 110110)
					System.out.println("El código "+codigo+" corresponde a un artículo DEFECTOSO");
				else {
					System.out.println("El código "+codigo+" corresponde a un artículo NO DEFECTUOSO");
				}
			}
		}
	}

}
