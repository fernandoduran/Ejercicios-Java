import java.util.Scanner;

public class Ejercicio2ConDoWhile {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String car;

		int i = 0;
		int max;

		System.out.println("Escribe un carácter:");
		car = teclado.nextLine();

		System.out.println("Cuantas veces quieres repetirlo?:");
		max = teclado.nextInt();

		do {

			System.out.println(car);
			i++;

		} while (i < max);

		teclado.close();

	}
}