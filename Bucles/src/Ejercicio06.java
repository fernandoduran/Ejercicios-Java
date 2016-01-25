import java.util.Scanner;

/**
 * @author Fernando Duran Ruiz
 */
public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("Dime un numero: ");
			numero = sc.nextInt();
						
			if(numero == 0){
				for(int i = 1; i <= 10; i++){
					System.out.println(numero + " x "+ i + " = " +numero*i);
					}
				break;
			}
			
			if(numero == 1){
				System.out.println("¡No seas tonto!");
				continue;
			}
			System.out.println("\n-------------------------------\nTabla del " +numero+ "\n-------------------------------\n");
			for(int i = 1; i <= 10; i++){
				System.out.println(numero + " x "+ i + " = " +numero*i);
				}
		}while(true);
	}
}
