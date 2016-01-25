import java.util.Scanner;
public class Ejerc11Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int numero;
				
		do{
			System.out.println("Introduce un número entre 1 y 20 por favor");
			numero = sc.nextInt();
		}while(numero <1 || numero>20);
		System.out.println("EL número escrito es: " +numero);
		sc.close();
		System.exit(0);
	}
}
