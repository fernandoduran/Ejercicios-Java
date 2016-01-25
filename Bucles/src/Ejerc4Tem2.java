import java.util.*;
public class Ejerc4Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Escribe un número entre el 1 y el 5");
		numero = sc.nextInt();
		
		while(numero != 3){
			
			if(numero >= 1 && numero <= 5){
				System.out.println("Escribe otro número: ");
				numero = sc.nextInt();
			} else {
				System.out.println("Valor no válido, escribe un número dentro del rango indicado");
			}
		}
		System.out.println("¡Felicidades, has acertado!");
		sc.close();
	}
}
