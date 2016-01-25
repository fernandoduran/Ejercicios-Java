import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		final String CLAVE_REQUERIDA = "java8";
		
		Scanner entry = new Scanner(System.in);

		System.out.println("Introduce la clave");
		String clave = entry.nextLine();

		if (CLAVE_REQUERIDA.equals(clave)) {
			System.out.println("Acceso concedido");

		} else {
			System.out.println("Acceso denegado");
		}
		entry.close();
	}
}