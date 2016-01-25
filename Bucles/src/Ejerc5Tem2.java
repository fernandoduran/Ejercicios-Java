import java.util.*;
public class Ejerc5Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int multiplo;
		int i = 1;
		int result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número y te mostraré su tabla de multiplicar");
		multiplo = sc.nextInt();
		
		while(i<=10){
			result = multiplo * i;
			System.out.println(multiplo +" x " +i + " = " +result);
			i++;
		}
		sc.close();
	}
}
