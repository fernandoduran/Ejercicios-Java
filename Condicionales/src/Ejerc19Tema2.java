import java.util.Scanner;

public class Ejerc19Tema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		boolean mayorDeEdad;

		System.out.println("Edad:");
		int edad = entrada.nextInt();

		// if (edad >= 18) {
		// mayorDeEdad = true;
		// } else {
		// mayorDeEdad = false;
		// }

		mayorDeEdad = (edad >= 18) ? true : false;

		System.out.println("Mayor de edad: " + mayorDeEdad);
		entrada.close();
	}
}
