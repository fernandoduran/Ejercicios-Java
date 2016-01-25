import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String arrayTest[] = new String[5];

		System.out
				.println("Introduce una pregunta y sus posibles respuestas: ");

		arrayTest[0] = sc.nextLine();

		for (int i = 1; i < arrayTest.length; i++) {

			System.out
					.println("Respuesta " + i + ": ");

			arrayTest[i] = sc.nextLine();

		}

		System.out.println(arrayTest[0]);

		for (int i = 1; i < arrayTest.length; i++) {
			System.out.println("\t" + arrayTest[i]);
		}

		sc.close();

	}

}