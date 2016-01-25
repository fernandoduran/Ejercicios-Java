import java.util.Scanner;

public class Ejercicio3ConDoWhile {

	public static void main(String[] args) {

		// Escribe una aplicación que pregunte
		// repetidamente un número entero hasta que el
		// usuario escriba un valor entre 1 y 10.

		// A continuación el
		// programa escribirá un mensaje informando del número introducido.

		Scanner entrada = new Scanner(System.in);

		int numero;

		do {

			System.out.println("Escribe un numero del 1 al 10");
			numero = entrada.nextInt();

		} while (numero < 1 || numero > 10);

		System.out.println("Su número es: " + numero);

	}

}