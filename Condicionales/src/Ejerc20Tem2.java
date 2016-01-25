import java.util.Scanner;

public class Ejerc20Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Nombre: ");
		String nombre = entrada.nextLine();

		// if(nombre.equals("")){
		// nombre = "Desconocido";
		// }

		nombre = (nombre.equals("")) ? "Desconocido" : nombre;

		System.out.println(nombre);
		entrada.close();
	}
}
