package sesion02;

public class TarifaTaxi {
	
	public static void main(String[] args) {
		int km = 101;

		double tarifa;

		if (km <= 30) {
			tarifa = 18;

		} else if (km <= 100) {

			tarifa = 18 + (km - 30) * 0.85;

		} else {

			tarifa = 18 + (km - 100) * 0.65 + 70 * 0.85;
		}
		System.out.println();
		System.out.println("CALCULO TARIFA TAXI");
		System.out.println();
		System.out.println("Kilómetros recorridos => "+km);
		System.out.printf("El importe total a pagar es %.2f €", tarifa);
	}

}
