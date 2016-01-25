import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double[] temperaturas = new double[8];
		int posMin;
		double aux;

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("Introduce la temperatura " + i + ": ");
			temperaturas[i] = entrada.nextDouble();
		}

		for (int i = 0; i < temperaturas.length - 1; i++) {

			// BUSCAR LA POSICIÓN DEL ELEMENTO
			// MÁS PEQUEÑO EN EL SUBARRAY DESDE I HASTA EL FINAL.
			posMin = i;
			for (int j = i + 1; j < temperaturas.length; j++) {
				if (temperaturas[j] < temperaturas[posMin]) {
					posMin = j;
				}
			}

			// INTERCAMBIAR LA POSICIÓN DE ESE ELEMENTO MÁS PEQUEÑO
			// POR LA POSICIÓN EN LA QUE ESTAMOS AHORA (i).
			// ES DECIR, INTERCAMBIAREMOS LA POSICIÓN posMin POR i
			aux = temperaturas[posMin];
			temperaturas[posMin] = temperaturas[i];
			temperaturas[i] = aux;

			// POR ÚLTIMO LA i AUMENTARÁ EN 1 Y SE VOLVERÁ A EMPEZAR
			// HASTA LLEGAR AL PENÚLTIMO ELEMENTO DEL ARRAY.

			// Podemos ver en cada pasada del bucle cómo va quedando el array
			for (int k = 0; k < temperaturas.length; k++) {
				System.out.println(temperaturas[k]);
			}
			System.out.println("----------------------");
		}
		
	}

}
