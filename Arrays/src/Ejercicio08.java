import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int notas[] = new int[10];

		int i = 0;

		while (i < 10) {
			System.out.println("Dime las notas");
			notas[i] = teclado.nextInt();
			if (notas[i] < 0) {
				break;
			}
			i++;
		}

		i = 0;
		System.out.println("Estas son tus notas:");
		while (i < 10) {
			System.out.println("nota " + i + ": " + notas[i]);
			i++;
		}
		teclado.close();
	}

}