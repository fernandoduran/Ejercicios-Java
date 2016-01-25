import java.util.Scanner;

/**
 * @author Fernando Duran Ruiz
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		byte opc;

		System.out
				.println("Elige el idioma en el que quieras recibir un saludo: \n"
						+ " 1) Francés\n"
						+ " 2) Inglés\n"
						+ " 3) Alemán\n"
						+ " 4) Italiano");
		opc = sc.nextByte();

		switch (opc) {
		case 1:
			System.out.println("Bonjour");
			break;
		case 2:
			System.out.println("Good morning");
			break;
		case 3:
			System.out.println("Guten morgen");
			break;
		case 4:
			System.out.println("Buongiorno");
			break;
		default:
			System.out.println("Buenos días");
		}
		sc.close();
	}

}