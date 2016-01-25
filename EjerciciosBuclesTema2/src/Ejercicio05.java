import java.util.Scanner;
/**
 * @author Fernando Duran Ruiz
 *
 */
public class Ejercicio05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		double num = (int)(Math.random()*10 + 1); //Crear un número aleataorio enterio
		int numero, i = 1; //Variable para leer el numero del usuario y un contador
		Scanner sc = new Scanner(System.in); //Objeto clase Scanner
		
		//Si queremos comprobar el correcto funcionamiento, imprimimos el numero aleatorio
		//System.out.println(num);
		
		//Bucle que pedirá al usuario un numero hasta que lo adivinie y los intentos sean como máximo 3
		do{
			System.out.print("Advinina el número oculto: ");
			numero = sc.nextInt();
			i++;
		}while(num != numero && i<=3);
		sc.close();//Cerramos objeto clase Scanner
	}
}
