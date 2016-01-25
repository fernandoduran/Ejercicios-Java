import java.util.Scanner;
/**
 * @author Fernando Duran Ruiz
 */
public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = (int)(Math.random()*10 + 1); //Crear un número aleataorio enterio
		int numero, i = 0; //Variable para leer el numero del usuario y un contador
		Scanner sc = new Scanner(System.in); //Objeto clase Scanner
		
		//Si queremos comprobar el correcto funcionamiento, imprimimos el numero aleatorio
		System.out.println(num);
		
		//Bucle que pedirá al usuario un numero hasta que lo adivinie y los intentos sean como máximo 3
		while(i >= 0){
			System.out.print("Advinina el número oculto: ");
			numero = sc.nextInt();
			i++;
			
			if(i == 3 || numero == num){

				if(i == 1 && num == numero){
					System.out.println("¡Has acertado y has obtenido 10 puntos!");
				} else if(i == 2 && num == numero){
					System.out.println("¡Has acertado y has obtenido 5 puntos!");
				} else if(i == 3 && num == numero){
					System.out.println("¡Has acertado y has obtenido 2 puntos!");
				} else {
					System.out.println("Lo siento, pero al haber fallado no hay puntos");
				}
				break;
			}
		}
		sc.close();//Cerramos objeto clase Scanner
		System.exit(0);
	}
}
