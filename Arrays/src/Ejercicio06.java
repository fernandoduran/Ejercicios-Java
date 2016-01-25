import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int productos[] = new int[10];

		for (int i = 0; i < productos.length; i++) {
			System.out.print("Precio de producto " + i + ": ");
			productos[i] = entrada.nextInt();

		}

		System.out.println("\nLista de precios");
		System.out.println("===== == =======");

		for (int i = 0; i < productos.length; i++) {
			System.out.println("Producto " + i + ":\t" + productos[i]);
		}
	}
}