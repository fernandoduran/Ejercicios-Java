/**
 * @author Fernando Duran Ruiz
 *
 */
import java.util.*;
public class Ejercicio04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte num;//Variable para leer el número introducido pro teclado
		Scanner sc = new Scanner(System.in);
		
		//Bucle FOR que solicita un número 5 veces
		for(int i = 1; i <= 5; i++){
			System.out.print("Introduce un numero: ");
			num = sc.nextByte();
		}
		System.out.println("¡Has fallado!");
		sc.close();//Cerramos objeto clase Scanner
	}

}
