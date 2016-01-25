import java.util.*;
public class Ejerc3Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		while(numero > 10 || numero < 1){
			
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();	
		}
		sc.close();
	}
}
