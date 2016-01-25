public class EjemploBuclesAnidados1 {

	public static void main(String[] args) {

		// Programa que escribe cinco filas con diez asteriscos cada una.

		for (int i = 1; i <= 5; i++) {

			// Aquí ahora escribiremos diez asteriscos
			// Nos imaginamos que sólo podemos escribir los asteriscos
			// de uno en uno.
			for (int j = 1; j <= 10; j++) {
				// Pintamos un *
				System.out.print("*");
			}

			System.out.println();

		}
	}

}
