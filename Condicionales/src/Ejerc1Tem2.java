import java.util.*;
public class Ejerc1Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temperatura;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la temperatura del reactor nuclear");
		temperatura = sc.nextInt();
		
		if (temperatura > 120) {
			System.out.println("¡TEMPERATURA DEL REACTOR CRÍTICA, CORRED INSENSATOS!");
		}
		sc.close();
	}
}
