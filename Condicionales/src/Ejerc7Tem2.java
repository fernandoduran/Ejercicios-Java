import java.util.*;
public class Ejerc7Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final byte TOPSECRET = 6;
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Dime un n�mero del 1 al 10: ");
		num = sc.nextInt();
		
		if(num == TOPSECRET){
			System.out.println("Has acertado el n�mero secreto, �enhorabuena!");
		}else {
			System.out.println("No has acertado el n�mero secreto");
		}
		sc.close();
	}
}
