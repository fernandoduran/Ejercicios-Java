import java.util.Scanner;

/**
 * @author Fernando Duran Ruiz
 */
public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = (int)(Math.random()*10 + 1); //Crear un n�mero aleataorio enterio
		int numero, i = 0; //Variable para leer el numero del usuario y un contador
		Scanner sc = new Scanner(System.in); //Objeto clase Scanner
		
		//Si queremos comprobar el correcto funcionamiento, imprimimos el numero aleatorio
		System.out.println(num);
		
		//Bucle que pedir� al usuario un numero hasta que lo adivinie y los intentos sean como m�ximo 3
		while(i >= 0){
			System.out.print("Advinina el n�mero oculto: ");
			numero = sc.nextInt();
			i++;
			if(i == 3 || numero == num){
				String result = (num == numero)?"Has acertado el n�mero en "+i+" intentos":"Has fallado";
				System.out.println(result);
				break;
			}
		}
		sc.close();//Cerramos objeto clase Scanner
	}
}
