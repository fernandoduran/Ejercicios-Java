import java.util.Scanner;
public class Ejerc20Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		byte numero;
		
		for(int i = 1; i <= 10; i++){
			System.out.print("Numero secreto: ");
			numero = sc.nextByte();
			
			if(numero == 6){
				System.out.println("¡Has acertado!");
				break;
			}else if(i == 10){
				System.out.println("¡Has perdido!");
			}
		}
		sc.close();
		System.exit(0);
	}
}
