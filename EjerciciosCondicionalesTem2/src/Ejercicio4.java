import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce nota: ");
		float nota = entrada.nextFloat();
		
		if (nota < 4) {
			System.out.println("rojo");
		} else if (nota >= 4 && nota < 5) {
			System.out.println("verde");
		} else if (nota >= 5) {
			System.out.println("azul");
		}
		entrada.close();
	}

}