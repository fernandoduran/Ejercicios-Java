import java.util.Scanner;

public class Ejerc1Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String letra;
		int i = 1;
		
		System.out.println("Introduce una letra");
		letra = sc.nextLine();
		
		while(i<=100){
			System.out.println(letra);
			i++;
		}
		sc.close();
	}
}
