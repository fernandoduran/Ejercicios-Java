import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		final int MAX_COMPRAS = 200;
		
		Scanner entrada = new Scanner(System.in);
		double compras[] = new double[MAX_COMPRAS];

		System.out.println("Ve escribiendo los precios de los productos:");

		int i = 0;
		double precio;

		// Leemos los precios, guardando cada uno de ellos en una
		// posición del array.
		do {
			System.out.println("Producto " + i + ": ");
			precio = entrada.nextDouble();
			compras[i] = precio;
			i++;
		} while (i < compras.length && precio != 0);

		System.out.println("\nLista de la compra:");
		System.out.println("===== == == ======");

		// Escribimos todos los elementos del array compras hasta
		// encontrar la posición con un 0.
		i = 0;
		while (i < compras.length && compras[i] != 0) {
			System.out.println(compras[i]);
			i++;
		}
	}
}
