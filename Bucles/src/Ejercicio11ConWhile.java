import java.util.Scanner;

public class Ejercicio11ConWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero = 0;

		while (numero < 1 || numero > 20) {
			System.out.println("Introduce un número entre 1 y 20 por favor");
			numero = sc.nextInt();
		}
		
		System.out.println("EL número escrito es: " + numero);
		sc.close();

	}

}
