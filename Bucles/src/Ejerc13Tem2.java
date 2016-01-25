import java.util.Scanner;

public class Ejerc13Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Dime un número");
		numero = sc.nextInt();
		
		for(int i = 1; i <= 10; i++){
					
			System.out.println(numero +" x " +i+ " = " +numero*i);
		}
		sc.close();
	}
}
