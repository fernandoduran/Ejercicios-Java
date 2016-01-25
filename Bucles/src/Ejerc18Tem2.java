import java.util.*;
public class Ejerc18Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int nota;
		for(int i = 1; i <= 5; i++){
			do{
				System.out.println("Introduce una nota");
				nota = sc.nextInt();
				String resultado = (nota <1 || nota > 10)?"Error":"Ok";
				System.out.println(resultado);
			}while(nota >= 1 || nota <= 10);
		}
		sc.close();
	}

}

