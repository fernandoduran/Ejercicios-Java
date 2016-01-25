import java.util.Scanner;
public class Ejerc19Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int nota, suma = 0;

		for(int i = 1; i <= 5; i++){
			do{
				System.out.println("Introduce una nota");
				nota = sc.nextInt();
				
				suma = suma + nota;
	
				String resultado = (nota <1 || nota > 10)?"Error":"Ok";
				System.out.println(resultado);
			}while(nota >= 1 || nota <= 10);
		}
		System.out.println("La media es: " +(suma / 5));
		sc.close();
	}
}