import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] notas = new double[10];

		int i = 0;
		while (i < notas.length) {

			System.out.println("Introduce la nota");
			notas[i] = entrada.nextDouble();
			i++;

		}
		
		for (int j = 0; j < 10; j++) {

			System.out.println(notas[j]);
		}
		
	}
}