import java.util.Scanner;

public class Ejerc2Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String letra;
		int repeticiones;
		int i = 1;
		
		System.out.println("Introduce una letra");
		letra = sc.nextLine();
		
		System.out.println("Cuantas veces quieres repetirla?");
		repeticiones = sc.nextInt();
		
		while(i<=repeticiones){
			System.out.println(letra);
			i++;
		}
		sc.close();
	}
}
