import java.util.Scanner;
/**
 * @author Fernando Duran Ruiz
 */
public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("Dime un numero: ");
			numero = sc.nextInt();
			
			System.out.println("\n-------------------------------\nTabla del " +numero+ "\n-------------------------------\n");
			
			if(numero == 0){
				for(int i = 1; i <= 10; i++){
					System.out.println(numero + " x "+ i + " = " +numero*i);
					}
				break;
			}
			
			for(int i = 1; i <= 10; i++){
				System.out.println(numero + " x "+ i + " = " +numero*i);
				}
		}while(true);
	}
}
