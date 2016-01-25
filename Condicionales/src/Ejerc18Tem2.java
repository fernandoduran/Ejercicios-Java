import java.util.Scanner;

public class Ejerc18Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		int numero;
		System.out.println("Escribe un número entero entre 1 y 10:");
		if (entrada.hasNextInt() == true) {

			numero = entrada.nextInt();

			if (numero >= 1 && numero <= 10) {
				if (numero == 3) {
					System.out.println("Has acertado el número.");
				} else {
					System.out.println("El número es " + numero);
				}
			} else {
				System.out.println("El número no está entre 1 y 10.");
			}

		} else {
			System.out.println("ERROR.");
		}
		entrada.close();
	}
}
