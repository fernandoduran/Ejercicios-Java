import java.util.Scanner;

public class Ejerc18Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		int numero;
		System.out.println("Escribe un n�mero entero entre 1 y 10:");
		if (entrada.hasNextInt() == true) {

			numero = entrada.nextInt();

			if (numero >= 1 && numero <= 10) {
				if (numero == 3) {
					System.out.println("Has acertado el n�mero.");
				} else {
					System.out.println("El n�mero es " + numero);
				}
			} else {
				System.out.println("El n�mero no est� entre 1 y 10.");
			}

		} else {
			System.out.println("ERROR.");
		}
		entrada.close();
	}
}
