import java.util.Scanner;

public class Ejercicio1ConDoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un carácter: ");
		String caracter = entrada.nextLine();

		int i = 0;
		while (i < 100) {
			System.out.print(caracter);
			i++;
		}

	}

}
