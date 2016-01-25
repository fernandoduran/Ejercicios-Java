public class EjemploPrimosAvanzados {

	public static void main(String[] args) {
		int[] primos = new int[50000];
		primos[0] = 2;

		int numPrimos = 1;
		int candidato = 3;
		boolean esPrimo = true;
		int i;

		System.out.println("Calculando números primos ...");
		long tiempoInicio = System.currentTimeMillis();
		while (numPrimos < primos.length) {

			i = 0;
			esPrimo = true;
			while (i < numPrimos && esPrimo == true) {
				if (candidato % primos[i] == 0) {
					esPrimo = false;
					break;
				}
				i++;
			}

			if (esPrimo == true) {
				primos[numPrimos] = candidato;
				System.out.println(numPrimos + " --> " + candidato);
				numPrimos++;
			}

			candidato = candidato + 2; // Ahora sólo tomamos como candidatos los
										// nºs impares

		}
		System.out.println("Tiempo: "+(System.currentTimeMillis()-tiempoInicio+" sm"));
	}

}