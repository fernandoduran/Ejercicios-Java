import java.util.Scanner;
public class Ejerc9Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dividendo;
		int divisor;
		int resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Indicame un dividendo: ");
		dividendo = sc.nextInt();
		
		System.out.println("Ahora indicame un divisor: ");
		divisor = sc.nextInt();
		
		resultado = dividendo;
		
		while(resultado>=divisor){
			resultado = resultado - divisor;
		}
		System.out.println("El resultado es: " +resultado);
		sc.close();
	}
}
