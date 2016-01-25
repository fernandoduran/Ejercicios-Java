import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		final String NOMBRE_REQUERIDO = "Frank";
		final String CLAVE_REQUERIDA = "java8";

		Scanner entry = new Scanner(System.in);

		System.out.println("Introduce el nombre");
		String nombre = entry.nextLine();

		System.out.println("Introduce la clave");
		String clave = entry.nextLine();

		if (NOMBRE_REQUERIDO.equals(nombre) && CLAVE_REQUERIDA.equals(clave)) {
			System.out.println("Acceso concedido");
		} else {
			System.out.println("Acceso denegado");
		}
		entry.close();
	}
}